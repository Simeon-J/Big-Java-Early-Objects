package Notes;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Earthquake magnitude: ");
        int richter = scan.nextInt();

        switch (richter) {
            case (8):
                System.out.println("Most structures fall");
                break;
            case (7):
                System.out.println("Most buildings destroyed");
                break;
            case (6):
                System.out.println("Buildings considerably damaged");
                break;
            case (4):
                System.out.println("Damage to poorly constructed buildings");
                break;
            default:
                System.out.println("No quake");
                break;
        }
    }
}
