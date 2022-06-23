import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            String str = scn.next();

            boolean flag = false;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '0' || str.charAt(i) == '5'){
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }      
    }
}