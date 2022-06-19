import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t > 0){
            int points = scn.nextInt();
            int questions = scn.nextInt();

            int totalPoints = points/10;
            System.out.println(totalPoints * questions);
            t--;
        }
    }
}
