package Arrays;

public class LC875_KokoEatingBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int k =0;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int val:piles){
            if(high<val){
                high = val;
            }
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            long totalhr = 0;
            for(int i=0;i<piles.length;i++){
                totalhr += (piles[i] + mid - 1) / mid;
            }
            if(totalhr<=h){
                k = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h =8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
