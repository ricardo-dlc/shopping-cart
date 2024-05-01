import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial card balance:");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();

        Card card = new Card(initialBalance);
        System.out.println("Your card has: $" + card.getBalance());

        int choice = 1;
        while (choice != 0) {
            System.out.println("Write yor item's description:");
            String description = scanner.nextLine();

            System.out.println("Write yor item's price:");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Purchase purchase = new Purchase(description, price);

            if (card.makePurchase(purchase)) {
                System.out.println("Enter 1 to continue, 0 to exit");
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Insufficent balance!");
                break;
            }
        }

        System.out.println("*".repeat(100));
        System.out.println("Yor purchase history is:");
        card.showShoppingHistory();
        System.out.println("*".repeat(100));
        System.out.println("Final card's balance is %.2f".formatted(card.getBalance()));

        scanner.close();
    }
}
