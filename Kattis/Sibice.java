import java.util.*;

public class Sibice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        double max = Math.sqrt(w*w+h*h);
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            if(x <= max) System.out.println("DA");
            else System.out.println("NE");
        }
    }

}
