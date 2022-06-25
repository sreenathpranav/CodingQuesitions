package Numbers;

public class _15ReverseDigits {
    public static void main(String[] args) {
        int n=472,rev=0,digit=0;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
/*Time Complexity: o(log N), Space Complexity: o(1)*/