import java.util.*;

public class UVA_10346 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int k = in.nextInt();
			int counter = 0;
			int butts = n;
			counter += n;
			while(n/k != 0){
				counter += n/k;
				butts = n%k;
				n = n/k + butts;
			}
			System.out.println(counter);
		}
	}
}
