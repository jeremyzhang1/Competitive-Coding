import java.util.*;

public class UVA_10783 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i = 1; i <= testCases; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int total = 0;
			if(a%2 == 0){
				a += 1;
			}else if(b%2 == 0){
				b -= 1;
			}
			for(int j = a; j <= b; j+=2){
				total += j;
			}
			System.out.println("Case " + i + ": " + total);
		}
	}
}
