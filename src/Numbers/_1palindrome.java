package Numbers;

public class _1palindrome {
    public static void main(String[] args) {
        int X= 123;
        int dummy=X;
        int Y= reverse(dummy);
        if(X==Y){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
    static int reverse(int n){
        int r=0;
        while(n>0){
            int digit= n%10;
            r=r*10+digit;
            n=n/10;
        }
        return r;
    }
}
