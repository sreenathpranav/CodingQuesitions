package Numbers;

public class _18Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial by For Loop is: "+fact(5));
        System.out.println("Factorial by recursion is: "+factRecursion(5));
    }

    //factorial by recursion
    static int factRecursion(int n){
        if(n==0){
            return 1;
        }
        return n*factRecursion(n-1);
    }

    //by loop
    static int fact(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
    }
}
