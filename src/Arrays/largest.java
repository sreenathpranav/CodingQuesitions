package Arrays;

import java.util.Arrays;

import static Arrays.smallest.sort;

//Find the Largest element in an array
public class largest {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int arr1[]  = {8,10,5,7,9};

        System.out.println(sort(arr));
        System.out.println(largest(arr1));
    }

    //O(nlogn)
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //O(n)
    static int largest(int arr[]){
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}