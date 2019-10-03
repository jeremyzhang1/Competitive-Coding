import java.util.*;

public class Abc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        nums[0] = in.nextInt();
        nums[1] = in.nextInt();
        nums[2] = in.nextInt();
        Arrays.sort(nums);
        in.nextLine();
        String order = in.nextLine();
            if(order.contains("ABC")){
                System.out.println(nums[0] + " " + nums[1] + " "+nums[2]);
            }
            else if(order.contains("ACB")){
                System.out.println(nums[0] + " " + nums[2] + " "+nums[1]);
            }
            else if(order.contains("BAC")){
                System.out.println(nums[1] + " " + nums[0] + " "+nums[2]);
            }
            else if(order.contains("BCA")){
                System.out.println(nums[1] + " " + nums[2] + " "+nums[0]);
            }
            else if(order.contains("CAB")){
                System.out.println(nums[2] + " " + nums[0] + " "+nums[1]);
            }
            else if(order.contains("CBA")){
                System.out.println(nums[2] + " " + nums[1] + " "+nums[0]);
            }
    }
}
