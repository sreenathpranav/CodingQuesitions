package Numbers;

public class _4primeRange {
    public static void main(String[] args) {
        int start =1,end=100;
        for(int i=start;i<=end;i++){
            if(i!=1 && isPrime(i)==true){
                System.out.print(i+" ");
            }
        }

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
