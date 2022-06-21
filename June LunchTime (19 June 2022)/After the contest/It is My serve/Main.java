import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t > 0){
            int alice = scn.nextInt();
            int bob = scn.nextInt();

            int totalpoints = alice + bob + 1;

            if(totalpoints % 4 == 1 || totalpoints % 4 == 2){
                System.out.println("Alice");
            } else{
                System.out.println("bob");
            }
            t--;
        }
    }
}
