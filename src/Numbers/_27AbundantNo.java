package Numbers;

public class _27AbundantNo {
    public static void main(String[] args) {
        int n=27;
        int sum=0;

            for(int i=1;i<=n;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
            sum-=n;
            if(sum>n)
                System.out.println("Abundant No");
            else
                System.out.println("Not Abundant No");
        }

}
