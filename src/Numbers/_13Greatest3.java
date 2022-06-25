package Numbers;

public class _13Greatest3 {
    public static void main(String[] args) {
        int n1=1,n2=3,n3=5;
        if(n1>n2 && n1>n3){
            System.out.println(n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2);
        }
        else
            System.out.println(n3);
    }
}
