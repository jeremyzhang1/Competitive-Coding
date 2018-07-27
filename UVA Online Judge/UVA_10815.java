import java.util.*;

public class UVA_10815 {

	public static void main(String[] args)throws NoSuchElementException {
		Scanner in = new Scanner(System.in);
		ArrayList<String> text = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(in.nextLine());
		String tempo = st.nextToken();		
		while(in.hasNextLine()){
			if(!text.contains(tempo)){
				text.add(tempo);
				System.out.println("got here" + tempo);
			}else{
				st.nextToken();
			}
			Collections.sort(text);
			for(int j = 0; j < text.size(); j++){
				//System.out.println(text.get(j));				
			}
		}
	}
}
