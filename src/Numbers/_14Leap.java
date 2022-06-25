package Numbers;

public class _14Leap {
    public static void main(String[] args) {
        int yr=2000;
        if(((yr%4==0) && (yr%100!=0)) || (yr%400==0)){
            System.out.println("Leap");
        }
        else
            System.out.println("Not Leap");
    }
}
/*Time Complexity: O(1).
Space Complexity: O(1).*/