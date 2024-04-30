import java.util.ArrayList;
import java.util.Collections;

public class ShoppingCart {
    private ArrayList<Item> purchaseList = new ArrayList<Item>();

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
