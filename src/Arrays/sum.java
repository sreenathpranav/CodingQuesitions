package Arrays;

import java.util.stream.IntStream;

/*Given a array find total sum of array*/
public class sum {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int arr[]={5,3,9,7,6};
        int n=array.length,sum=0;

        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        System.out.println(sum);

        int sum2 = IntStream.of(arr).sum(); //using IntStream Java Collections
        System.out.println(sum2);
    }
}
/*
Time Complexity: O(n) As we traverse the array once.
Space Complexity: O(1)*/