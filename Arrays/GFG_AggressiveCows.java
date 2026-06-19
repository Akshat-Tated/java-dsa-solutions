package Arrays;

import java.util.Arrays;

public class GFG_AggressiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[stalls.length-1] - stalls[0];
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            int lastCow = stalls[0];
            int remCow = k-1;
            for(int i =1;i<stalls.length;i++){
                if(stalls[i]-lastCow >= mid){
                    lastCow = stalls[i];
                    remCow--;
                }
            }
            if(remCow >0){
                end = mid-1;
            }else{
                ans = mid;
                start = mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] salls ={1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(salls, k));
    }
}
