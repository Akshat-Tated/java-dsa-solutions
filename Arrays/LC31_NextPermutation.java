package Arrays;

public class LC31_NextPermutation {
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            //swap
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int idx = -1;
        int n =  nums.length;
        // finding the idx which is the decreasing point
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                //swap
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        reverse(nums,idx+1,n-1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        nextPermutation(nums);
        for (int x : nums)
            System.out.print(x + " ");
        System.out.println();
    }
}

