package Arrays;

import java.util.stream.IntStream;

public class average {

    public static void main(String[] args) {
        int arr1[]={1,2,1,1,5,1};

        int n=arr1.length,sum=0;
        double avg=0;
        for(int i=0;i<n;i++){
            sum+=arr1[i];
        }
        avg= (double) sum/n;
        System.out.println(avg);
    }
}
