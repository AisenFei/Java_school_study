package code_2021_0104;

import java.util.Arrays;

public class ArraysSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,2,7,8,6,9,4};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr,0,4);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
