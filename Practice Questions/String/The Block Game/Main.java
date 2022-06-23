import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            String str = String.valueOf(n);

            int i = 0;
            int j = str.length();
            j--;

            boolean flag = true;
            while(i <= j){
                if(str.charAt(i) != str.charAt(j)){
                    flag = false;
                    break;
                }
                i++;
                j--;
            }

            if(flag){
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
    }
}
