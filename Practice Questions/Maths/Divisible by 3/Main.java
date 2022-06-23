import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int a = scn.nextInt();
            int b = scn.nextInt();

            if((a % 3 == 0) || (b % 3 == 0)){
                System.out.println(0);
            }
            else if(Math.abs(a-b) % 3 == 0){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }       
    }
}