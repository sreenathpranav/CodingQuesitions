package Numbers;
//Given an integer N. Print the Fibonacci series up to the Nth term.

public class _17Fibonacci {
    public static void main(String[] args) {
        int n=6;

        Native(n);
        Optimized(n); //in space complexity.
    }

/*Time Complexity: O(n)+O(n), for calculating and printing the Fibonacci series.
Space Complexity: O(n), for storing Fibonacci series.*/
    static void Native(int n){
        int fib[]= new int[n+1];
        if(n==0)
            System.out.println(0);

        else {
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<=n;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
        }
        System.out.print("Native approach: ");
        for(int i=0;i<=n;i++){
            System.out.print(fib[i]+" ");
        }
        System.out.println();
    }

/*Time Complexity: O(N).As we are iterating over just one for a loop.
Space Complexity: O(1).*/
    static void Optimized(int n){
        System.out.print("Optimized approach : ");
        if(n==0)
            System.out.println(0);
        else{
            int secondLast=0,last=1,currentPosition;
            System.out.print(secondLast+" "+last+" ");
            for(int i=2;i<=n;i++){
                currentPosition=last+secondLast;
                secondLast=last;
                last=currentPosition;
                System.out.print(currentPosition+" ");
            }

        }

    }
}
