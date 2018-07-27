import java.util.*;

public class UVA_11547 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i = 1; i <= testCases; i++){
			int testcase = in.nextInt();
			testcase = 315*testcase + 36962;
			testcase = testcase / 10;
			testcase = testcase % 10;
			testcase = Math.abs(testcase);
			System.out.print(testcase + "\n");
		}
	}
}
