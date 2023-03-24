import java.util.Scanner;


public class VendingMachine {
    static Scanner userInput = new Scanner(System.in);



    // Method That Displays Item Choices
    public static double displayChoices() {
        double price = -1;

        System.out.println("Here's All Of The Candy That I Have");
        System.out.println("A          $1.25        Snickers");
        System.out.println("B          $1.75        Twix");
        System.out.println("C          $2.00        Reese's");
        System.out.println("D          $1.25        Hershey Bar");
        System.out.println("E          $0.85        Skittles");
        System.out.println("F          $1.15        Milky Way");
        System.out.println("G          $0.95        Crunch");
        System.out.println("H          $1.35        Almond Joy");
        System.out.println("I          $49.99        ULTIMATE CANDY BAR");

        System.out.println();
        System.out.println("Which Candy Would You Like To Purchase?: (Choose Letter)");
        String choice = userInput.next().toUpperCase();

        if (choice.equals("A")) {
            price = 1.25;
            return price;
        } else if(choice.equals("B")) {
            price = 1.75;
            return price;
        } else if (choice.equals("C")) {
            price = 2.00;
            return price;
        } else if (choice.equals("D")) {
            price = 1.25;
            return price;
        } else if (choice.equals("E")) {
            price = 0.85;
            return price;
        } else if (choice.equals("F")) {
            price = 1.15;
            return price;
        } else if (choice.equals("G")) {
            price = 0.95;
            return price;
        } else if (choice.equals("H")) {
            price = 1.35;
            return price;
        } else if (choice.equals("I")) {
            price = 49.99;
            return price;
        }

        else {
            return price;
        }
    }

    //Method to Dispense Candy and Return Change
    public static void dispense (double moneyInserted, double candyCost) {

        if (moneyInserted > candyCost) {
            System.out.println("Vending...");
            System.out.println("Here's Your Candy!");
            double change = (double)moneyInserted - (double)candyCost;
            System.out.println("Here's your $" + change + " in change");
            System.out.println("Please Come Back Soon! Enjoy!");

        } else {
            System.out.println("You Don't Have Enough Money! Go Away! Here's Your $" + moneyInserted + " Back! Now Leave!");
        }
    }

    public static void main(String[] args) {

        // Welcome Statement of Vending Machine
        System.out.println("Welcome to My Vending Machine!");
        System.out.println("If You Don't Have Money, Go Away!");

        // Prompt For User Information
        System.out.println("How Much Money Do You Have?");
        double moneyInserted = userInput.nextDouble();

        double candyCost = displayChoices();

        dispense(moneyInserted, candyCost);
    }
}
