
package bee;

import java.util.Scanner;


public class Bee {


    public static void main(String[] args) {
        BeeManager mg = new BeeManager();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mg = new BeeManager();
                    mg.createBee();
                    mg.showBee();
                    break;
                case 2:
                    mg.Damage();
                    mg.showBee();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
