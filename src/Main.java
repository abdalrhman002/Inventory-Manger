public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit(250,4.99,"Apple", "KG");
        apple.setQuantity(apple.getQuantity() - 1);
        Inventory inventory = new Inventory();
        inventory.addItem(apple);
        inventory.showAllItems();

    }
}