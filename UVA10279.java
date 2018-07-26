import java.util.*;

public class UVA10279 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int games = in.nextInt();
		for(int count = 1; count <= games; count++){
			int size = in.nextInt();
			char[][] mines = new char[size][size];
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					mines[i][j] = in.next().charAt(0);
				}
			}
			
		}
	}
}
