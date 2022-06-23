import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            long n, x;
            n = scn.nextInt();
            x = scn.nextInt();
            long value = (myPow(2, n-1) * x) % mod;
            System.out.println(value);
        }
    }

    static long mod = 1000000007;
    
    public static long myPow(long x, long n){
        long ans = 1;
        long nn = n;
        while(nn > 0){
            if(nn % 2 == 0){
                x = (x * x) % mod;
                nn = nn / 2;
            } else {
                ans = (ans * x) % mod;
                nn = nn - 1;
            }
        }
        return ans;
    }
}