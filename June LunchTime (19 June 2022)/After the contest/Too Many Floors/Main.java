import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t > 0){
            int chefRoom = scn.nextInt();
            int chefinaRoom = scn.nextInt();

            int chefFloor = findFloor(chefRoom);
            int chefinaFloor = findFloor(chefinaRoom);
            // System.out.println(chefFloor);
            // System.out.println(chefinaFloor);

            int floorDifference = Math.abs(chefFloor - chefinaFloor);

            System.out.println(floorDifference);
            t--;
        }
    }

    public static int findFloor(int n){
        int floor = (n - 1) / 10;
        return floor + 1;
    }
}
