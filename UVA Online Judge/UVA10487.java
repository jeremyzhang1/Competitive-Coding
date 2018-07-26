import java.util.*;

public class UVA10487 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		for(int T = 1 ;; ++T){
            int N = sc.nextInt();
            if(N == 0) break;

            int arr [] = new int[N];
            for(int i = 0 ; i < N ; ++i) arr[i] = sc.nextInt();

            int Q = sc.nextInt();
            System.out.printf("Case %d:\n" , T);
            while (Q-- > 0){
                int num = sc.nextInt();
                int diff = arr[0] + arr[1];
                for(int i = 0 ; i < N - 1 ; ++i)
                    for(int j = i + 1 ; j < N ; ++j)
                        diff = Math.abs(num - (arr[i] + arr[j])) < Math.abs(num - diff) ? arr[i] + arr[j] : diff;
                System.out.printf("Closest sum to %d is %d.\n" , num , diff);
            }
        }
	}
}
