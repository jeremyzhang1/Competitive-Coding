import java.util.*;

public class UVA_272 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line;
		boolean first = true;
		while(in.hasNextLine()){
			line = in.nextLine();
			for(int i = 0; i < line.length(); i ++){
			if(line.charAt(i) == '\"'){
				if(first == true){
					System.out.print("``");
					first = false;
					continue;
				}else{
					System.out.print("''");
					first = true;
					continue;
				}	
			}
			System.out.print(line.charAt(i));
			}
			System.out.print("\n");
		}
	}
}