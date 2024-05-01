import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingHistory {
    private List<Purchase> purchaseList;

    public ShoppingHistory() {
        this.purchaseList = new ArrayList<>();
    }

    public void add(Purchase item) {
        this.purchaseList.add(item);
    }

    public void show() {
        Collections.sort(this.purchaseList);
        for (Purchase item : purchaseList) {
            System.out.println(item);
        }
    }
}
