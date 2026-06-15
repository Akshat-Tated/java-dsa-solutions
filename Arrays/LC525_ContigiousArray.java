package Arrays;

import java.util.HashMap;

public class LC525_ContigiousArray {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);

        int sum = 0;
        int maxLen = 0;

        for(int i=0;i<nums.length;i++){
            sum += (nums[i] == 1) ? 1 : -1;

            if(hm.containsKey(sum)){
                maxLen = Math.max(maxLen, i - hm.get(sum));
            }else{
                hm.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}
