import java.util.*;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            String str = scn.next();

            String result = "";
            for(int i=0; i<n; i++){
                if(str.charAt(i) == 'A'){
                    result += 'T';
                }
                if(str.charAt(i) == 'T'){
                    result += 'A';
                }
                if(str.charAt(i) == 'C'){
                    result += 'G';
                }
                if(str.charAt(i) == 'G'){
                    result += 'C';
                }
            }

            System.out.println(result);
        }
    }
}