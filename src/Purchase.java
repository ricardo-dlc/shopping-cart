public class Purchase implements Comparable<Purchase> {
    private String description;
    private double price;

    public Purchase(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Purchase otherItem) {
        return Double.valueOf(this.price).compareTo(otherItem.getPrice());
    }

    @Override
    public String toString() {
        return "%s   \t$%.2f".formatted(this.description, this.price);
    }

}
