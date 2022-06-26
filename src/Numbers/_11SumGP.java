package Numbers;

public class _11SumGP {
    public static void main(String[] args) {
        double a=2.0,r=1.5,sum=0;
        int n=4;
        for(int i=0;i<n;i++){
            sum+=a;
            a*=r;
        }
        System.out.println(sum);
    }
}
// or apply equation.... sum=a*(( (float) Math.pow(r,n)-1)/r-1)