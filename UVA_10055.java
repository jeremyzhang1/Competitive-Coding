import java.util.*;
public class UVA_10055 {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            long a = in.nextLong();
            long b = in.nextLong();
            in.nextLine();
            if(a>b)
                System.out.println(a-b);
            else
                System.out.println(b-a);
        }
    }
}
