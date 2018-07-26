import java.util.*;

public class UVA102 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int minMoves = Integer.MAX_VALUE;
			String a = null;
			int currentMoves;
			int brown1 = in.nextInt();
			int green1 = in.nextInt();
			int clear1 = in.nextInt();
			int brown2 = in.nextInt();
			int green2 = in.nextInt();
			int clear2 = in.nextInt();
			int brown3 = in.nextInt();
			int green3 = in.nextInt();
			int clear3 = in.nextInt();
			
			currentMoves = brown2 + brown3 + clear1 + clear3 + green1 + green2;
			if(currentMoves < minMoves){
				minMoves = currentMoves;
				a = "BCG";
			}

			currentMoves = brown2 + brown3 + clear1 + clear2 + green1 + green3;
			if(currentMoves < minMoves){
				minMoves = currentMoves;
				a = "BGC";
			}

			currentMoves = brown1 + brown3 + clear2 + clear3 + green1 + green2;
			if(currentMoves < minMoves){
				minMoves = currentMoves;
				a = "CBG";
			}

			currentMoves = brown1 + brown2 + clear2 + clear3 + green1 + green3;
			if(currentMoves < minMoves){
				minMoves = currentMoves;
				a = "CGB";
			}

			currentMoves = brown1 + brown3 + clear1 + clear2 + green2 + green3;
			if(currentMoves < minMoves){
				minMoves = currentMoves;
				a = "GBC";
			}

			currentMoves = brown1 + brown2 + clear1 + clear3 + green2 + green3;
			if(currentMoves < minMoves){
				minMoves = currentMoves;
				a = "GCB";
			}
			System.out.println(a + " " + minMoves);
		}
	}
}
