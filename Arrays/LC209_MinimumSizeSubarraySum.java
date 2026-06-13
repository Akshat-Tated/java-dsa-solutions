package Arrays;

public class LC209_MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int ans =Integer.MAX_VALUE;
        int sum = 0;
        int j=0;
        int i=0;
        while(j<nums.length){
            sum += nums[j];
            while(sum>=target){
                ans = Math.min(ans,(j-i+1));
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
