import java.io.*;
import java.math.*;
import java.util.*;

public class M {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("M.txt"));
		
		TreeMap<String, String> map = new TreeMap<>();
		
		int cases = sc.nextInt();
		sc.nextLine();
		
		while(cases-- > 0) {
			String line = sc.nextLine();
			String mod = line.toLowerCase().replaceAll("[-'.]", "").trim();
			if (mod.indexOf("the ") == 0)
				mod = mod.substring(3);
			else if (mod.indexOf("an ") == 0)
				mod = mod.substring(2);
			else if (mod.indexOf("a ") == 0)
				mod = mod.substring(1);
			mod = mod.replace(" ", "");
			map.put(mod, line);
		}
		for (Map.Entry<String, String> s : map.entrySet())
			println(s.getValue());
		
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