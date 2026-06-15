package Arrays;

import java.util.HashMap;

public class LC560_SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += nums[i];
            arr[i]= sum;
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i] == k){
                count++;
            }
            if(freq.containsKey(arr[i] - k)){
                count += freq.get(arr[i] - k);
            }

            if(freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k =3;
        System.out.println(subarraySum(nums, k));
    }
}
