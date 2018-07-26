import java.util.*;

public class UVA10252 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			char[] a = in.nextLine().toCharArray();
			char[] b = in.nextLine().toCharArray();
			ArrayList<Character> subString = new ArrayList<Character>();
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i = 0; i < a.length; i++){
				for(int j = 0; j < b.length; j++){
					if(a[i] == b[j] && !subString.contains(a[i])){
						subString.add(a[i]);
					}
				}
			}
			for(int i = 0; i < subString.size(); i++){
				System.out.print(subString.get(i));
			}
			System.out.print("\n");
		}
	}
}