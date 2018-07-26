import java.util.*;

public class UVA299 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i <= n; i++){
			int length = in.nextInt();
			int counter = 0;
			int[] cars = new int[length];
			for(int j = 0; j < length; j++){
				cars[j] = in.nextInt();
			}
			for(int j = 0; j < cars.length - 1; j++){
				for(int k = j + 1; k <cars.length; k++){
					if(cars[j] > cars[k])
						counter ++;
				}
			}
			System.out.println("Optimal train swapping takes " + counter + " swaps.");
		}
	}
}
