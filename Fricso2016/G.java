import java.util.*;
import java.io.*;

public class G {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("G.in"));
		while(in.hasNextInt()) {
			int n = in.nextInt();
			if(n == 0) {
				break;
			}
			in.nextLine();
			int p = 0;
			int runsum = 0;
			for(int i = 0; i < n; i++) {
				String query = in.nextLine();
				if(query.equals("touchdown")) {
					runsum += 7;
					p += runsum;
				}
				if(query.equals("field goal")) {
					runsum += 3;
					p += runsum;
				}
				if(query.equals("safety")) {
					runsum += 2;
					p += runsum;
				}
			}
			System.out.println("Ensign Redshirt does " + p + " pushups!");
		}
	}

}
