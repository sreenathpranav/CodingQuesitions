package Arrays;

/*Rearrange the array such that the first half is arranged in increasing order,
and the second half is arranged in decreasing order*/

import java.util.Arrays;

public class rearrange {
    public static void main(String[] args) {
        int arr[]={3,6,1,2,5,4};
        rearrange(arr);
    }
    static void rearrange(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        display(arr);
    }
    static void display(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+ " ");
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
