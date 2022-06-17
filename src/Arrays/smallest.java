package Arrays;

import java.util.Arrays;

public class smallest {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int arr1[] = {23,55,15,3,35,50,30,4};
        System.out.println(sort(arr));
        System.out.println(smallestNo(arr1));
    }

    //O(nlogn)
    static int sort(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //O(n)
    static int smallestNo(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}