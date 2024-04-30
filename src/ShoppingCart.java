import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    private List<Item> purchaseList;

    public ShoppingCart() {
        this.purchaseList = new ArrayList<>();
    }

    public void add(Item item) {
        this.purchaseList.add(item);
    }

    public void showPurchaseHistory() {
        Collections.sort(this.purchaseList);
        for (Item item : purchaseList) {
            System.out.println(item);
        }
    }
}
