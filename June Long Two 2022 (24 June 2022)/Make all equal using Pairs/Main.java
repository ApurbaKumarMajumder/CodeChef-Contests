import java.util.*;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            
            // iterate for result
            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        break;
                    }
                }
                if(count >= 1){
                    count++;
                }
            }

            if(count == n){
                System.out.println(n - 1);
            } else if((n/2) >= count){
                System.out.println(count);
            } else {
                System.out.println(count);
            }
        }
    }
}
// 1 1 1 1 1 3 4 1