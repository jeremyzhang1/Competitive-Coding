import java.util.*;

public class Planina {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 2;
        while(n > 0){
            s += s-1;
            n--;
        }
        System.out.println(s*s);
    }

}
