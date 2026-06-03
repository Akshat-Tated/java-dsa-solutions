package Arrays;

public class LC53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum<0){
                currSum = 0;
            } 
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1-3,4,6,-2};
        System.out.println(maxSubArray(nums));
    }
}
