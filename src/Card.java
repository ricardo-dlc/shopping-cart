public class Card {
    private double balance;

    public Card(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void purchase(double price) {
        this.balance -= price;
    }
}
