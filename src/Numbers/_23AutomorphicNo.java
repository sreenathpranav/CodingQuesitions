package Numbers;
/*Given a number, check if it is automorphic or not.
A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.*/

public class _23AutomorphicNo {
    public static void main(String[] args) {
        int n=25;
        if(isAutomorphic(n)==true)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
    static boolean isAutomorphic(int n){
        int sq=n*n;
        while(n>0){
            if(n%10!=sq%10)
                return false;

            n=n/10;
            sq/=10;
        }
        return true;
    }
}
/*Time Complexity: O(N)
Space Complexity: O(1)*/