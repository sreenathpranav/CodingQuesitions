package Numbers;

import com.sun.deploy.security.SelectableSecurityManager;

public class _5armstrong {
    public static void main(String[] args) {
        int n=153;
        if(isArmstrong(n))
        System.out.println("Yes, it is a Amstrong no");
        else
            System.out.println("Not a Amstrong no");
    }
    static boolean isArmstrong(int n){
        int temp=n,org=n,count=0;

        //count digits
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        //calculate amstrong
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+= Math.pow(digit,count);
            n=n/10;
        }
        return (sum==org);
    }
}
