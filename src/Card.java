public class Card {
    private double balance;
    private ShoppingHistory shoppingHistory;

    public Card(double balance) {
        this.balance = balance;
        this.shoppingHistory = new ShoppingHistory();
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean makePurchase(Purchase purchase) {
        double purchasePrice = purchase.getPrice();
        if (purchasePrice <= this.balance) {
            this.balance -= purchasePrice;
            this.shoppingHistory.add(purchase);
            return true;
        }
        return false;
    }

    public void showShoppingHistory() {
        this.shoppingHistory.show();
    }
}
