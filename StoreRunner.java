import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Liam's Apple Store!");
        System.out.println("1. Granny Smith");
        System.out.println("2. Fuji");
        System.out.println("3. Golden Delicious");
        System.out.print("Choose an apple: ");
        int choice = input.nextInt();

        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();

        if (choice == 1) {
            System.out.print("Is it extra tart? (true/false): ");
            boolean tart = input.nextBoolean();
            GrannySmith apple = new GrannySmith(weight, tart);
            System.out.println(apple);
        } else if (choice == 2) {
            System.out.print("Is it crisp? (true/false): ");
            boolean crisp = input.nextBoolean();
            Fuji apple = new Fuji(weight, crisp);
            System.out.println(apple);
        } else if (choice == 3) {
            System.out.print("Does it have golden skin? (true/false): ");
            boolean goldenSkin = input.nextBoolean();
            GoldenDelicious apple = new GoldenDelicious(weight, goldenSkin);
            System.out.println(apple);
        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
        System.out.println("Thanks for shopping!");
    }
}
