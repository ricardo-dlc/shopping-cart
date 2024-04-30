public class Item implements Comparable<Item> {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Item otherItem) {
        if (this.getPrice() > otherItem.getPrice()) {
            return 1;
        } else if (this.getPrice() < otherItem.getPrice()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "%s   \t$%.2f".formatted(this.description, this.price);
    }

}
