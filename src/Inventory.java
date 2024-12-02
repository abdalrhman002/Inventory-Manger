import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Item> items = new LinkedList<>();

    public int getNumberOfItems(){
        return items.size();
    }
    public boolean addItem(Item item){
        return items.add(item);
    }
    public boolean removeItem(Item item){
        return items.remove(item);
    }
    public void showAllItems(){
        for (Item item : items){
            item.displayInfo();
        }
    }

}
