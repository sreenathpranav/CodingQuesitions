package Numbers;
//Given a number n. Print all Prime Factors of the given number n.

public class _21PrimeFactors {
    public static void main(String[] args) {
        int n=60;

        /*Time Complexity: O(n)
        Space Complexity: O(1)*/
        primeFactor(n);

        /*Time Complexity: O ( sqrt(N) )
        Space Complexity: O(1)*/
        prime(n);
    }
    static void primeFactor(int n){
        System.out.print("Prime Factors Native: ");
        for(int i=2;n>1;i++){
            if(n%i==0){
                while(n%i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
        System.out.println();
    }
    static void  prime(int n){
        System.out.print("Prime Factors Optimized: ");
        for (int i = 2; i * i <= n || n > 1; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
    }
}
/*What are Prime Factors?
First of all, let’s understand what the Prime Factor of a number is. Factors are the numbers that can be multiplied to get a new number.
The factors of a number that are prime are called Prime Factors.
For example: If N=12, 12=2x2x3 here 2 and 3 are prime factors of the 12 and 2^2 x 3 makes up to 12.*/

