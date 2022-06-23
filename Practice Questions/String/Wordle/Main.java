import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            String str1 = scn.next();
            String str2 = scn.next();
            String str = "";
            for(int i=0; i<5; i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    char ch = 'G';
                    str = str + ch;
                } else {
                    char ch = 'B';
                    str = str + ch;
                }
            }
            System.out.println(str);
        }
    }
}
