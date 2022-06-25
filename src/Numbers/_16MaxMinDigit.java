package Numbers;

public class _16MaxMinDigit {
    public static void main(String[] args) {
        int n=2746;
        int small=Integer.MAX_VALUE,large=Integer.MIN_VALUE,digit=0;
        while(n!=0){
            digit=n%10;
            small=Math.min(small,digit);
            large=Math.max(large,digit);
            n=n/10;
        }
        System.out.println("Smallest digit: "+ small);
        System.out.println("Largest digit: "+ large);
    }
}
/*Time Complexity: O(log N)
Space Complexity: O(1)*/