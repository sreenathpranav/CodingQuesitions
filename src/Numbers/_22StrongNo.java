package Numbers;

//Check if a number is a Strong Number or not
/*When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number.
Strong number is also known as Krishnamurthi number/Peterson Number.*/

public class _22StrongNo {
    public static void main(String[] args) {
        int n=145;
        int digit,sum=0,number=n;
        while(n>0){
            digit=n%10;
            sum+=factorial(digit);
            n=n/10;
        }
        if(sum==number && number!=0 ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No ");
        }
    }
    static int factorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
}
