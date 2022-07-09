import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        // public static Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            boolean result = solve();
            if(result){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }

    public static boolean solve(){
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a >= 10 && b >= 10 && c >= 10){
            if(a + b + c >= 100){
                return true;
            }
        } else {
            return false;
        }
        
        return false;
    }
}