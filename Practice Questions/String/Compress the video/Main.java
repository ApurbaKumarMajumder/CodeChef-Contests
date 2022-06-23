import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            int count = 1;
            // compress the video
            for (int i = 0; i < n-1; i++) {
                count++;
                if(arr[i] == arr[i+1]){
                    count--;
                }
            }
            System.out.println(count);
        }       
    }
}