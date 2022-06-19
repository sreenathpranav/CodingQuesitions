package Arrays;
/*Reverse a given Array
Problem Statement: You are given an array. The task is to reverse the array and print it. */
public class reverse {
    public static void main(String[] args) {
       int arr[] = {5,4,3,2,1};
        int n=arr.length;
        reverse(arr,n);

        int array[] = {55,44,33,22,11};
        int l=array.length;
        reverseswap(array,l);
    }
    //space complexity increase as we use and extra array...but time is O(n)
    static void reverse(int arr[],int n){
        int ans[]= new int[n];      //extra array
        for(int i=n-1;i>=0;i--){
            ans[n-1-i]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+ " ");
        }
        System.out.println("");
    }

    //space complexity is better as no extra array.
    static void reverseswap(int arr[],int n){
        int first=0,last=n-1,temp=0;

        for(;first<last;first++,last--){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
