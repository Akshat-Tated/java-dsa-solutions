package Arrays;

public class TUF_CountInversions {
    public static long numberOfInversions(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 1, 3, 5};
        System.out.println(numberOfInversions(nums));
    }
}
