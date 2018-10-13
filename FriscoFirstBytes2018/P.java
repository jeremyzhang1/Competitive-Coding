import java.io.*;
import java.math.*;
import java.util.*;

public class P {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("P.txt"));
		
		int cases = sc.nextInt();
		sc.nextLine();
		while (cases-- > 0) {
			int num = sc.nextInt();
			int ori = num;
			sc.nextLine();
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(num);
			while (true) {
				int sum = 0;
				while (num != 0) {
					int dig = num % 10;
					sum += dig * dig;
					num /= 10;
				}
				if (sum == 1) {
					num = sum;
					break;
				}
				if (arr.contains(sum))
					break;
				arr.add(sum);
				num = sum;
			}
			println(ori + " is " + (num == 1 ? "happy" : "sad"));
		}
		
		sc.close();
	}

	private static void print(Object x) {
		System.out.print(x);
	}

	private static void println(Object x) {
		print(x + "\n");
	}

	private static void println() {
		print("\n");
	}

	private static void printf(String format, Object... args) {
		print(String.format(format, args));
	}
}