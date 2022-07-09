package Numbers;

public class _25lcm {
    public static void main(String[] args) {
        int n1=4,n2=8;
        int ans=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                ans=i;
            }
        }
        int lcm= (n1*n2)/ans;
        System.out.println(lcm);
    }
}
