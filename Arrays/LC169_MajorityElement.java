package Arrays;

public class LC169_MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];
        for(int i =1;i<nums.length;i++){
            if(count==0){
                element = nums[i];
                count = 1;
            }
            else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
            
        }
        return element;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
