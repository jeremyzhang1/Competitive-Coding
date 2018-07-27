import java.util.*;
import java.math.*;

public class UVA_10523 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int a = in.nextInt();
			BigInteger sum = new BigInteger("0");
			BigInteger A;
			A = BigInteger.valueOf(a);
			for(int i = 1; i <= n; i++){
				sum = sum.add(BigInteger.valueOf(i).multiply((A.pow(i))));
			}
			System.out.println(sum);
		}
	}
}
