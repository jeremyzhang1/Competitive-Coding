import java.util.*;

public class UVA10041 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i = 1; i <= cases; i++){
			int total = 0;
			int relatives = in.nextInt();
			int[] location = new int[relatives];
			for(int j = 0; j < location.length; j++){
				location[j] = in.nextInt();
			}
			Arrays.sort(location);
			int median = (location.length - 1)/2;
			for(int j = 0; j < location.length; j++){
				total += Math.abs(location[median] - location[j]);
			}
			System.out.println(total);
		}
	}
}
