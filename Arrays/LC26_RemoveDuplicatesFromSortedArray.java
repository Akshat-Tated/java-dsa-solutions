package Arrays;

public class LC26_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int j= 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }        
        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
