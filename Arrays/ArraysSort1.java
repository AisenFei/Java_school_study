package code_2021_0104;

import java.util.Arrays;

public class ArraysSort1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,3,8,6,9,7,4};
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
