package Arrays;

public class LC11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max_water = Integer.MIN_VALUE;
        int curr_water = 0;
        int diff = 0;
        while(start<end){
            diff = end-start;
            if(height[start]<height[end]){
                curr_water = height[start] * diff;
                max_water = Math.max(curr_water,max_water);
                start++;
            }else{
                curr_water = height[end] * diff;
                max_water = Math.max(curr_water,max_water);
                end--;
            }
        }
        return max_water;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
}
