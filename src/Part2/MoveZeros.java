package Part2;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {0,1,3,0,4,0,5,0};
        int[] result = new int[arr.length];

        for (int i = 0,j=0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.println(arr[i]);
                result[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
