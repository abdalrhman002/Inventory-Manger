public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Fruit apple = new Fruit("k521" ,250,4.99,"Apple", "KG");
        Fruit orange = new Fruit("h25" ,350,3.99,"Orange", "KG");
        Fruit banana = new Fruit("B2l5" ,250,2.99,"Banana", "KG");
        Drink drink1 = new Drink("u5kv", 100, 4.5, "V7", "can",
                0.3, "Liter");
        Drink drink2 = new Drink("u5xv", 100, 5.5, "red bull", "can",
                0.3, "Liter");

        inventory.addItem(apple);
        inventory.addItem(orange);
        inventory.addItem(banana);
        inventory.addItem(drink1);
        inventory.addItem(drink2);
        
        inventory.removeItem("B2l5");
        System.out.println(inventory.inStock("B2l5"));

        inventory.showAllItems();


    }
}