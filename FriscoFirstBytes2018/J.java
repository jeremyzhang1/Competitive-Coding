import java.io.*;
import java.math.*;
import java.util.*;

public class J {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("J.txt"));
		
		int cases = sc.nextInt();
		sc.nextLine();
		while(cases-- > 0) {
			int rows = sc.nextInt();
			sc.nextLine();
			int xr, xc, r, c;
			xr = xc = r = c = 0;
			for (int x = 0; x < rows; x++) {
				String line = sc.nextLine();
				if (line.indexOf("X") >= 0) {
					xr = x;
					xc = line.indexOf("X");
				}
				if (line.indexOf("*") >= 0) {
					r = x;
					c = line.indexOf("*");
				}
			}
			int vert = xr - r;
			int hor = xc - c;
			if (vert < 0)
				print(-vert + " north ");
			else if (vert > 0)
				print(vert + " south ");
			if (hor > 0)
				print(hor + " east");
			else if (hor < 0)
				print(-hor + " west");
			println();
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