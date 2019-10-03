import java.util.*;
public class BatterUp{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int atbats = count;
        int sum = 0;
        for(int i = 0; i < count; i ++){
            int x = in.nextInt();
            if(x == -1){
                atbats--;
                
            }else{
                sum += x;
            }
        }
        double avg = (double)sum / atbats;
        System.out.println(avg);    
    }   
}
