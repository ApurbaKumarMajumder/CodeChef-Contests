import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int k = scn.nextInt();

            if(k == 1){
                if(n % 4 == 0){
                    System.out.println("On");
                } else {
                    System.out.println("Ambiguous");
                }
            } else {
                if(n % 4 == 0){
                    System.out.println("Off");
                } else {
                    System.out.println("On");
                }
            }
        }
    }
}