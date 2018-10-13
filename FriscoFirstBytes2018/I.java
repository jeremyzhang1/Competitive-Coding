import java.io.*;
import java.math.*;
import java.util.*;

public class I {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("I.txt"));
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n; i++){
			String name = in.nextLine();
			int cases = in.nextInt();
			int total = 0;
			for(int j = 0; j < cases; j++){
				total += in.nextInt();
			}
			in.nextLine();
			double area =  total/12.0*10;
			System.out.println((int)Math.ceil(area/400) + " gallon(s) of " + name);
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