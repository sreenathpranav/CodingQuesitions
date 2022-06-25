package Numbers;

public class _20FactorsOfNo {
    public static void main(String[] args) {
        int n1=9,n2=14;
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        optimisedSolution(n2);
    }
    static void optimisedSolution(int n){

        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){

                //if divisors are equal,print only one
                if(n/i==1)
                    System.out.print(" "+i);

                else //or print both
                    System.out.print(i+ " "+n/i+ " ");
            }
        }

    }
}
