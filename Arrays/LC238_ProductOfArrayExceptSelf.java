package Arrays;
import java.util.Arrays;

public class LC238_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }

        suffix[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        nums[0]=suffix[1];
        nums[nums.length-1] = prefix[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            nums[i] = prefix[i-1] *suffix[i+1]; 
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
