import java.util.*;
import java.math.*;

public class UVA_579 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Long> fibs  = new ArrayList<Long>();
		long first = 1, next = 1;
		long sum = 1;
		fibs.add((long) 1);
		fibs.add((long) 1);
		for (int counter = 1; counter <= 4998; counter++){
			sum = first + next;
			fibs.add(sum);			
			first = next;
			next = sum;
		while(in.hasNextInt()){
			int req = in.nextInt();
			System.out.println("The Fibonacci number for " + req + " is " + fibs.get(req -3));
		}
	}
	}
}
