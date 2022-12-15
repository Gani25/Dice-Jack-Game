
import java.util.Scanner;

public class DealershipProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Java Dealership:");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = sc.nextLine();
        switch (option) {
            case "a":
                System.out.println("What is your budget");
                int budget = sc.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have a insurance? write 'yes' or 'no'");
                    sc.nextLine();// next line trap or pitfall
                    String insurance = sc.nextLine();
                    System.out.println("\nDo you have a license? write 'yes' or 'no'");
                    String license = sc.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int score = sc.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && score > 660) {
                        System.out.println("\nSold! Pleasure doing business with you");

                    } else {
                        System.out.println("\nWe're sorry you are not eligible");
                    }
                } else {
                    System.out.println("\nWe don't sell cars under $10,000. Sorry");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car valuedat?");
                int value = sc.nextInt();
                System.out.println("\nWhat is your selling price");
                int price = sc.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you");
                } else {
                    System.out.println("\nSorry we are not interested");
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
        sc.close();
    }
}
