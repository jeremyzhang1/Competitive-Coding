import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Fibonnaci {

    public static final int MOD = 65536;
    public static final int MINUTE = 1000000000;

    //normal methods
    public static int recursion(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return recursion(n-1) + recursion(n-2);
        }
    }

    public static long iterative(int n){
        long[] fibs = new long[n+1];
        fibs[0] = 0;
        fibs[1] = 1;

        for(int i = 2; i < n+1; i++){
            fibs[i] = fibs[i-1]+fibs[i-2];
        }
        // System.out.println(Arrays.toString(fibs));
        return fibs[n];
    }

    public static long matrix(long n){
        long F[][] = new long[][]{{1,1},{1,0}};
        if(n == 0){
            return 0;
        }
        F = power(F, n-1);
        //System.out.printf("%d %d %d %d\n",F[0][0],F[0][1],F[1][0],F[1][1]);
        return F[0][0];
    }

    //helper methods for matrix
    public static long[][] multiply(long F[][], long M[][]){
        long x =  F[0][0]*M[0][0] + F[0][1]*M[1][0]; 
        long y =  F[0][0]*M[0][1] + F[0][1]*M[1][1]; 
        long z =  F[1][0]*M[0][0] + F[1][1]*M[1][0]; 
        long w =  F[1][0]*M[0][1] + F[1][1]*M[1][1]; 

        return new long[][]{{x,y},{z,w}};
    }

    //calculates F^n in O(log n) time using exponentiation by squaring
    public static long[][] power(long F[][], long n){
        if(n == 0){
            return new long[][]{{1,1},{1,0}};
        }
        if(n == 1){
            return F;
        }
        if(n % 2 == 0){
            return power(multiply(F,F), n/2);
        }else{
            return multiply(F, power(multiply(F,F), (n-1)/2));
        }
    }

    //modulo methods
    public static long iterativeMod(int n){
        long[] fibs = new long[n+1];
        fibs[0] = 0;
        fibs[1] = 1;

        for(int i = 2; i < n+1; i++){
            fibs[i] = (fibs[i-1]+fibs[i-2])%MOD;
        }
        return fibs[n];
    }

    public static long matrixMod(long n){
        long F[][] = new long[][]{{1,1},{1,0}};
        if(n == 0){
            return 0;
        }
        F = powerMod(F, n-1);
        //F = powerDumb(F, n-1);
        //System.out.printf("%d %d %d %d\n",F[0][0],F[0][1],F[1][0],F[1][1]);
        return F[0][0];
    }

    //helper methods for matrix
    public static long[][] multiplyMod(long F[][], long M[][]){
        long x =  (F[0][0]*M[0][0])%MOD + (F[0][1]*M[1][0])%MOD; 
        long y =  (F[0][0]*M[0][1])%MOD + (F[0][1]*M[1][1])%MOD; 
        long z =  (F[1][0]*M[0][0])%MOD + (F[1][1]*M[1][0])%MOD; 
        long w =  (F[1][0]*M[0][1])%MOD + (F[1][1]*M[1][1])%MOD; 

        return new long[][]{{x,y},{z,w}};
    }

    //calculates F^n in O(log n) time using exponentiation by squaring
    public static long[][] powerMod(long F[][], long n){
        if(n == 0){
            return new long[][]{{1,1},{1,0}};
        }
        if(n == 1){
            return F;
        }
        if(n % 2 == 0){
            return powerMod(multiplyMod(F,F), n/2);
        }else{
            return multiplyMod(F, powerMod(multiplyMod(F,F), (n-1)/2));
        }
    }

    public static long[][] powerDumb(long F[][], long n){
        long M[][] = new long[][]{{1,1},{1,0}};
        long mult[][] = F;
        for(long i = 2; i <= n; i++){
            mult = multiplyMod(mult, M);
        }
        return mult;
    }


    public static void main(String[] args) {
    //     System.out.println("Recursive");
    //     System.out.println("=========");
    //     for(int j = 5; j <= 45; j+=5){
    //         long total = 0;
    //         for(int i = 0; i < 10; i++){
    //             final long startTime = System.nanoTime();
    //             long ans = recursion(j);
    //             final long endTime = System.nanoTime();
    //             total += endTime-startTime;
    //         }
    //         System.out.println("Average for Fib " + j + " is: " + total/10 + " nanoseconds");
    //     }
        System.out.println("Iterative");
        System.out.println("=========");
        int ax = 180;
        for(int j = ax; j <= ax; j+=10){
            long total = 0;
            for(int i = 0; i < 10; i++){
                final long startTime = System.nanoTime();
                long ans = iterative(j);
                final long endTime = System.nanoTime();
                total += endTime-startTime;
            }
            System.out.println("Fib " + j + " is: " + total/10 + " nanoseconds");
            //System.out.println(total/100);
        }
        System.out.println("Matrix");
        System.out.println("======");
        for(int j = ax; j <= ax; j+=10){
            long total = 0;
            for(int i = 0; i < 10; i++){
                final long startTime = System.nanoTime();
                long ans = matrix(j);
                final long endTime = System.nanoTime();
                //System.out.println(ans);
                //System.out.println(endTime-startTime);
                total += endTime-startTime;
            }
            System.out.println("Fib " + j + " is: " + total/10 + " nanoseconds");
            //System.out.println(total/100);
        }
        // System.out.println("How many fibs in 1 minute?");

        // System.out.println("Recursive");
        // System.out.println("=========");

        // long startRecursion = System.nanoTime();
        // for(int i = 1; i < Integer.MAX_VALUE; i++){
        //     long beforeRecursion = System.nanoTime();
        //     if(beforeRecursion >= startRecursion + MINUTE){
        //         System.out.println("Before recursion");
        //         System.out.println("Recursion got to fib " + i + " in " + (beforeRecursion-startRecursion) + " nanoseconds");
        //         break;
        //     }
        //     recursion(i);
        //     long afterRecursion = System.nanoTime();
        //     if(afterRecursion >= startRecursion + MINUTE){
        //         System.out.println("After recursion");
        //         System.out.println("Recursion got to fib " + i + " in " + (afterRecursion-startRecursion) + " nanoseconds");
        //         break;
        //     }
        // }

        // System.out.println("Iterative");
        // System.out.println("=========");

        // long startIterative = System.nanoTime();
        // for(int i = 1; i < Integer.MAX_VALUE; i++){
        //     long beforeIterative = System.nanoTime();
        //     if(beforeIterative >= startIterative + MINUTE){
        //         System.out.println("Before iterative");
        //         System.out.println("Iterative got to fib " + i + " in " + (beforeIterative-startIterative) + " nanoseconds");
        //         break;
        //     }
        //     iterativeMod(i);
        //     long afterIterative = System.nanoTime();
        //     if(afterIterative >= startIterative + MINUTE){
        //         System.out.println("After iterative");
        //         System.out.println("Iterative got to fib " + i + " in " + (afterIterative-startIterative) + " nanoseconds");
        //         break;
        //     }
        // }
        // long finishedIterative = System.nanoTime();
        // System.out.println("Iterative finished in " + (finishedIterative-startIterative) + " nanoseconds");

        // System.out.println("Matrix");
        // System.out.println("======");

        // long startMatrix = System.nanoTime();
        // for(long i = 1; i < Long.MAX_VALUE; i++){
        //     long beforeMatrix = System.nanoTime();
        //     if(beforeMatrix >= startMatrix + MINUTE){
        //         System.out.println("Before matrix");
        //         System.out.println("Matrix got to fib " + i + " in " + (beforeMatrix-startMatrix) + " nanoseconds");
        //         break;
        //     }
        //     matrixMod(i);
        //     long afterMatrix = System.nanoTime();
        //     if(afterMatrix >= startMatrix + MINUTE){
        //         System.out.println("After matrix");
        //         System.out.println("Matrix got to fib " + i + " in " + (afterMatrix-startMatrix) + " nanoseconds");
        //         break;
        //     }
        // }
        // long finishedMatrix = System.nanoTime();
        // System.out.println("Matrix finished in " + (finishedMatrix-startMatrix) + " nanoseconds");
    }
}
