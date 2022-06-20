package Arrays;
/*Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.*/

public class rotateBlockSwapAlgo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2,n=arr.length;

        int ans[]=new int[n];

        //printing the first half
        for(int i=k;i<n;i++){
            ans[i]=arr[i];
            System.out.println(ans[i]);
        }

        //printing the second half according to k value
        for(int i=0;i<k;i++){
            int secIndex=i+k+1;
            ans[secIndex]=arr[i];
            System.out.print(ans[i]);
        }

    }
}
