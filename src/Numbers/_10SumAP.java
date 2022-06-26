package Numbers;

public class _10SumAP {
    public static void main(String[] args) {
        double a=1.5,d=3,sumAP=0.0;
        int n=5;

        for(int i=1;i<=n;i++){
            sumAP+=a;
            a+=d;
        }

        System.out.println(sumAP);
    }
}
//or apply equation...sum=n/2(2a+(n-1)*d);