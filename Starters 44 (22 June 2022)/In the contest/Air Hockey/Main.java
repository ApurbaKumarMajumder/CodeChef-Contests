import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t > 0){
            int Alice, Bob;
            Alice = scn.nextInt();
            Bob = scn.nextInt();

            if(Alice >= Bob){
                System.out.println(7-Alice);
            } else {
                System.out.println(7 - Bob);
            }
            t--;
        }
    }
}