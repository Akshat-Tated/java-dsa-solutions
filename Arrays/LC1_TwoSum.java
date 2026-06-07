package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i])){
                return new int[]{m.get(target-nums[i]),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{0,0}; //just for no compilation error
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));   
    }
}
