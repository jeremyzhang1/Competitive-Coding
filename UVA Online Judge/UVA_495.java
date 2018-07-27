import java.util.*;
import java.math.*;

public class UVA_495 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger fib[] = new BigInteger[5001];
        fib[0] = BigInteger.valueOf(0);
        fib[1] = BigInteger.valueOf(1);
        int n = 2;
        for (; n < 5001; ++n)
        	fib[n] = fib[n - 1].add(fib[n - 2]);
			
		while(in.hasNextInt()){
			int num = in.nextInt();
			System.out.printf("The Fibonacci number for %d is %s\n", num, fib[num].toString());
		}
	}
}
