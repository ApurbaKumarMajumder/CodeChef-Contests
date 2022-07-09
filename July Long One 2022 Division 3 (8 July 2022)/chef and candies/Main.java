import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        // public static Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int result = solve();
            System.out.println(result);
        }
    }

    public static int solve(){
        int a = scn.nextInt();
        int b = scn.nextInt();

        int c = a - b;
        if(c <= 0){
            return 0;
        } else {
            int d = c / 4;
            int e = c % 4;
            if(e > 0){
                d++;
            }
            return d;
        }
    }
}