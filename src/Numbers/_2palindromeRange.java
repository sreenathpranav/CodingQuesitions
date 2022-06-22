package Numbers;

public class _2palindromeRange {
    public static void main(String[] args) {
        int start = 100, end = 150,i=0;
//        int X= 121;
//        int dummy=X;
//        int Y= reverse(dummy);
        for ( i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i +" ");
            }
        }
    }
    static boolean isPalindrome(int n){
        int r=0;
        int dummy=n;
        while(n>0){
            int digit= n%10;
            r=r*10+digit;
            n=n/10;
        }
        if(dummy==r) return true;
        else return false;
    }
}
