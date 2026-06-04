package Arrays;

import java.util.Arrays;

public class TUF_FindTheRepeatingAndMissingNumber {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        long sn = (n * (n+1))/2; // sum of 1-n numbers
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6; // sum of squares of 1-n
        long sum = 0;
        long sum2 = 0; 
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            sum2 += (long) nums[i] * (long) nums[i]; 
        }
        long eq1 = sum - sn; // a-b
        long eq2 = sum2 - s2n; 
        eq2 = eq2/eq1; // a+b
        long a = (eq1+eq2)/2;
        long b = a-eq1;
        return new int[]{(int)a,(int)b};
    }
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 1, 1};
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums)));
    }
}
