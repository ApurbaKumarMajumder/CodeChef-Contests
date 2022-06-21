import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t > 0){
            int chefRoom = scn.nextInt();
            int chefinaRoom = scn.nextInt();

            int chefFloor = 0;
            int chefinaFloor = 0;

            if(chefRoom > 0 && chefRoom <11){
                chefFloor = 1;
            } else if(chefRoom >= 11 && chefRoom <= 20){
                chefFloor = 2;
            } else if(chefRoom >= 21 && chefRoom <= 30){
                chefFloor = 3;
            } else if(chefRoom >= 31 && chefRoom <= 40){
                chefFloor = 4;
            } else if(chefRoom >= 41 && chefRoom <= 50){
                chefFloor = 5;
            } else if(chefRoom >= 51 && chefRoom <= 60){
                chefFloor = 6;
            } else if(chefRoom >= 61 && chefRoom <= 70){
                chefFloor = 7;
            } else if(chefRoom >= 71 && chefRoom <= 80){
                chefFloor = 8;
            } else if(chefRoom >= 81 && chefRoom <= 90){
                chefFloor = 9;
            } else if(chefRoom >= 91 && chefRoom <= 100){
                chefFloor = 10;
            }

            if(chefinaRoom > 0 && chefinaRoom <11){
                chefinaFloor = 1;
            } else if(chefinaRoom >= 11 && chefinaRoom <= 20){
                chefinaFloor = 2;
            } else if(chefinaRoom >= 21 && chefinaRoom <= 30){
                chefinaFloor = 3;
            } else if(chefinaRoom >= 31 && chefinaRoom <= 40){
                chefinaFloor = 4;
            } else if(chefinaRoom >= 41 && chefinaRoom <= 50){
                chefinaFloor = 5;
            } else if(chefinaRoom >= 51 && chefinaRoom <= 60){
                chefinaFloor = 6;
            } else if(chefinaRoom >= 61 && chefinaRoom <= 70){
                chefinaFloor = 7;
            } else if(chefinaRoom >= 71 && chefinaRoom <= 80){
                chefinaFloor = 8;
            } else if(chefinaRoom >= 81 && chefinaRoom <= 90){
                chefinaFloor = 9;
            } else if(chefinaRoom >= 91 && chefinaRoom <= 100){
                chefinaFloor = 10;
            }

            int diff = Math.abs(chefFloor- chefinaFloor);
            // if(diff < 9){
            //     System.out.println(0);
            // } else if(diff > 9 && diff < 100){
            //     System.out.println(diff % 10);
            // }

            System.out.println(diff);
            
            t--;
        }
    }
}
