package Numbers;

public class _19power {
    public static void main(String args[]) {

        //using Math.pow class
        int n=5,k=3,ans=1;
        System.out.println(Math.pow(5,3));

        //method 2 using Iteration
        for(int i=0;i<k;i++){
            ans*=n;
        }
        System.out.print(ans);
    }
}
