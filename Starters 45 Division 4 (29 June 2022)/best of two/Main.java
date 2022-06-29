import java.util.*;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int x = scn.nextInt();
            int y = scn.nextInt();

            if(x > y){
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }
}
// 1 1 1 1 1 3 4 1