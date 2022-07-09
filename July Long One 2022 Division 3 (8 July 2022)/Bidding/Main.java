import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        // public static Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            solve();
        }
    }

    public static void solve(){
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a >= b && a >= c){
            System.out.println("Alice");
        } else if (b >= a && b >= c){
            System.out.println("Bob");
        } else {
            System.out.println("Charlie");
        }
    }
}