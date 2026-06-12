package Arrays;
import java.util.Arrays;

public class LC283_MoveZeroes {
    public static void moveZeroes(int[] arr) {
        int j = 1;
        int i=0;
        while(j<arr.length){
            if(arr[i] != 0) i++;
            if(arr[j]!=0 && arr[i]==0){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
