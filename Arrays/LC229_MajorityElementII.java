package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class LC229_MajorityElementII {
    // public static List<Integer> majorityElement(int[] nums) {
    //     List<Integer> ans = new ArrayList<>();
    //     int n = nums.length;
    //     int cnt1= 0, cnt2 =0;
    //     int ele1 = Integer.MIN_VALUE;
    //     int ele2 = Integer.MIN_VALUE;
    //     for(int i =0; i<n;i++){
    //         if(cnt1 == 0 && ele2 != nums[i]){
    //             cnt1++;
    //             ele1 = nums[i]; 
    //         }else if(cnt2 == 0 && ele1 != nums[i]){
    //             cnt2++;
    //             ele2 = nums[i];
    //         }else if(ele1 == nums[i]){
    //             cnt1++;
    //         }else if (ele2 == nums[i]){
    //             cnt2++;
    //         }else{
    //             cnt1--;
    //             cnt2--;
    //         }
    //     }

    //     cnt1 = 0;
    //     cnt2 = 0;
    //     for(int i=0; i<n;i++){
    //         if(nums[i] == ele1) cnt1++;
    //         if(nums[i] == ele2) cnt2++;
    //     }
    //     if(cnt1 > n/3) ans.add(ele1);
    //     if(cnt2 > n/3) ans.add(ele2);
    //     return ans;
    // }
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();

        int num = nums[0];

        for(int i=0;i<nums.length;i++){
            num = nums[i];
            if(lhm.containsKey(num)){
                lhm.put(num, lhm.get(num)+1);
            }else{
                lhm.put(num, 1);
            }            
        }

        Set<Integer> keys = lhm.keySet();
        for (Integer val : keys) {
            if(lhm.get(val) > nums.length/3){
                list.add(val);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
