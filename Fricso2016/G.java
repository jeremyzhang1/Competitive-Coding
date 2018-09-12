import java.util.*;
import java.io.*;

public class G {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("G.in"));
		while(in.hasNextInt()) {
			int n = in.nextInt();
			in.nextLine();
			int p = 0;
			for(int i = 0; i < n; i++) {
				String query = in.nextLine();
				if(query.equals("touchdown")) p+=7;
				if(query.equals("field goal")) p += 3;
				if(query.equals("safety")) p +=2;
			}
			System.out.println("Ensign Redshirt does " + p + " pushups!");
		}
	}

}
