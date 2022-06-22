package Numbers;

public class _3prime {
    public static void main(String[] args) {
        int n=2;
        if(n!=1 && isPrime(n)==true){
            System.out.println("Prime No");
        }
        else
            System.out.println("Not Prime No");

    }
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
