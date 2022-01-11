import java.util.*;

public class experiment {

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(){{put(0,-1);}};;
        int runningSum = 0;
        for (int i=0;i<nums.length;i++) {
            runningSum += nums[i];
            if (k != 0) runningSum %= k; 
            Integer prev = map.get(runningSum);
            if (prev != null) {
                if (i - prev > 1) return true;
            }
            else map.put(runningSum, i);
        }
        return false;
    }

    public boolean checkSubarraySum2(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        freq.put(0, -1);
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            sum %= k;
            Integer prev = freq.get(sum);
            if(prev != null){
                if(i-prev > 1){
                    return true;
                }
            }
            else{
                freq.put(sum, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //test checkSubarraySum
        int[] nums = {23,2,4,6,6};
        int k = 7;
        experiment e = new experiment();
        System.out.println(e.checkSubarraySum(nums, k));

        //test checkSubarraySum2
        nums = new int[]{23,2,4,6,6};
        k = 7;
        e = new experiment();
        System.out.println(e.checkSubarraySum2(nums, k));

    }
}