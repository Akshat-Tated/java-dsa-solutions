package Arrays;

public class LC152_MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int currMax = nums[0];
        int maxProd = nums[0];
        int currMin = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                //swap
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i],currMax*nums[i]);
            currMin = Math.min(nums[i],currMin*nums[i]);

            maxProd = Math.max(maxProd,currMax);
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int[] nums ={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
