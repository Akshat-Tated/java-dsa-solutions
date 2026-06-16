package Arrays;

import java.util.HashMap;

public class GFG_LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        // code here
        for(int i =1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        } // prefix array
        int maxCount = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                maxCount = i+1;
            }
            if(hm.containsKey(arr[i]-k)){
                maxCount = Math.max(maxCount, i - hm.get(arr[i] - k));
            }
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],i);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
