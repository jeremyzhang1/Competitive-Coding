import java.io.*;
import java.math.*;
import java.util.*;

public class N {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("N.txt"));
		int n = in.nextInt();
		in.nextLine();
		while(n-- > 0) {
			String[] frames = in.nextLine().split(" ");
			int score = 0;
			for (int x = 0, count = 0; x < frames.length - 1; x++) {
				char a = frames[x].charAt(0), b = ' ';
				if (frames[x].length() == 2)
					b = frames[x].charAt(1);
				int q = 0, w = 0;
				if (a != '-' && a != '/' && a != 'X') {
					q = Integer.parseInt(a + "");
					score += q;
				} 
				if (w != '-' && w != '/' && w != 'X') {
					w = Integer.parseInt(a + "");
					score += w;
				}
				if (count == 1) {
					score += q;
					count = 0;
				}
				if (b != '/') {
					w = 10 - q;
					count = 1;
					break;
				}
				if (a == 'X') {
					score += 10;
					count = 2;
				}
				print(score + " ");
			}
		}
		
		in.close();
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