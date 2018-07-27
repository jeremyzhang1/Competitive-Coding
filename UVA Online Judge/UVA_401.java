import java.util.*;

public class UVA_401 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
		int number = in.nextInt();
		if(Math.round(Math.sqrt(number))==Math.sqrt(number)){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		}

	}

}
