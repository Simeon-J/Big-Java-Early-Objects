package Notes;

import java.util.Scanner;

public class ElevatorSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Floor: ");
        int floor = scan.nextInt();

        int actualFloor = floor > 13 ? floor - 1 : floor; // conditional operator

        if (floor >= 13) {
            System.out.println("Your actual floor is : " + (floor-1));
        }
    }

}
