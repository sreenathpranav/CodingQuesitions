package Numbers;

public class _28DigitSum {
    public static void main(String[] args) {
        int n=472,digit,sum=0;

        while(n!=0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
