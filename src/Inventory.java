import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    public Inventory(){
        this.items = new LinkedList<>();
    }

    public int getNumberOfItems(){
        return items.size();
    }
    public boolean addItem(Item item){
        return items.add(item);
    }
    public boolean removeItem(Item item){
        return items.remove(item);
    }

    public boolean removeItem(String itemId){
        for (Item item: items){
            if (itemId.equals(item.getItemId())) {
                removeItem(item);
                return true;
            }
        }
        return false;
    }
    public void showAllItems(){
        for (Item item : items){
            item.displayInfo();
        }
    }
    public boolean inStock(String itemId){
        for (Item item: items){
            if (itemId.equals(item.getItemId()) && item.getQuantity() > 0) {
                return true;
            }
        }
        return false;
    }

}
