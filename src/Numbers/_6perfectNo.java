package Numbers;

public class _6perfectNo {
    public static void main(String[] args) {
        int x=28,sum=0;
        for(int i=1;i<=x-1;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        if(x==sum)
            System.out.println("Perfect No");
        else
            System.out.println("Not Perfect No");
    }

}
