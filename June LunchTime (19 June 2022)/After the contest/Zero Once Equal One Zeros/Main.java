import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t > 0){
            int n = scn.nextInt();
            
            System.out.print('0');
            for (int i = 1; i <= n-2; i++) {
                System.out.print('1');
            }
            System.out.println('0');
            t--;
        }
    }
}
