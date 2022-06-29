import java.util.*;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int totalSpace = scn.nextInt();
            int app1 = scn.nextInt();
            int app2 = scn.nextInt();
            int toBeInstalledApp = scn.nextInt();

            if(app1 + app2 + toBeInstalledApp <= totalSpace){
                System.out.println('0');
            } else if (toBeInstalledApp + app1 <= totalSpace || toBeInstalledApp + app2 <= totalSpace){
                System.out.println('1');
            } else {
                System.out.println('2');
            }
        }
    }
}
