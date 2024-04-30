import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
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

            Item item = new Item(description, price);

            if (item.getPrice() > card.getBalance()) {
                System.out.println("Insufficient balance!");
                break;
            } else {
                card.purchase(item.getPrice());
                shoppingCart.add(item);
            }

            System.out.println("Enter 1 to continue, 0 to exit");
            choice = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("*".repeat(100));
        System.out.println("Yor purchase history is:");
        shoppingCart.showPurchaseHistory();
        System.out.println("*".repeat(100));
        System.out.println("Final card's balance is %.2f".formatted(card.getBalance()));

        scanner.close();
    }
}
