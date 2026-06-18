package Arrays;

public class LC1011_CapacityToShipPackages {
    public static int shipWithinDays(int[] weights, int days) {
       int low = 0;
       int ans = 0;
       int high = 0;
       for(int val:weights){
        low = Math.max(low,val);
        high += val;
       }
       while(low<=high){
        int mid = low + (high-low)/2;
        int currcapacity = mid;
        int currdays = days;
        int i=0;
        while(i<weights.length){
            while(i<weights.length && currcapacity>=weights[i]){
                currcapacity -= weights[i];
                i++;
            }
            currcapacity = mid;
            currdays--;
        }
        if(currdays<0){
            low = mid+1;
        }else{
            ans = mid;
            high = mid-1;
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}
