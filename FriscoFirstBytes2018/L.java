import java.io.*;
import java.math.*;
import java.util.*;

public class L {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("L.txt"));
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("I", 1);
		map.put("II", 2);
		map.put("III", 3);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("VI", 6);
		map.put("VII", 7);
		map.put("VIII", 8);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XX", 20);
		map.put("XXX", 30);
		map.put("XL", 40);
		map.put("L", 50);
		map.put("LX", 60);
		map.put("LXX", 70);
		map.put("LXXX", 80);
		map.put("XC", 90);
		map.put("C", 100);
		map.put("CC", 200);
		map.put("CCC", 300);
		map.put("CD", 400);
		map.put("D", 500);
		map.put("DC", 600);
		map.put("DCC", 700);
		map.put("DCCC", 800);
		map.put("CM", 900);
		map.put("M", 1000);
		map.put("MM", 2000);
		map.put("MMM", 3000);
		while(sc.hasNextLine()) {
			int total = 0;
			String line = sc.nextLine();
			while (!line.equals("")) {
				int min = Integer.MAX_VALUE;
				for (Map.Entry<String, Integer> s : map.entrySet()) {
					String a = s.getKey();
					if (line.indexOf(a) != -1 && line.indexOf(a) + a.length() == line.length() && line.indexOf(a) < min)
						min = line.indexOf(a);
				}
				total += map.get(line.substring(min));
				line = line.substring(0, min);
			}
			println(total);
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