package Arrays;

public class LC2149_RearrangeArrayElements {
   public static int[] rearrangeArray(int[] nums) {
       int n = nums.length;
        int[] temp = new int[n];
        int even = 0,odd=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                temp[even] = nums[i];
                even +=2;
            }else{
                temp[odd]= nums[i];
                odd +=2;
            }
        }
        return temp; 
    } 
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(rearrangeArray(nums));
    }
}
