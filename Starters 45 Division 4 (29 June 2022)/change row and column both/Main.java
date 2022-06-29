import java.util.*;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int x1 = scn.nextInt();
            int y1 = scn.nextInt();
            int x2 = scn.nextInt();
            int y2 = scn.nextInt();

            if(x1 != x2 && y1 != y2){
                System.out.println('1');
            }
            else if ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) {
                System.out.println('2');
            } else if(x1 == y2 && x2 == y1) {
                System.out.println('1');
            } else {
                System.out.println('2');
            }
        }
    }
}
// 1 1 1 1 1 3 4 1
