public class Fruit extends Item{
    private String name;
    private String quantityUnite;

    public Fruit(int quantity, double price, String name, String quantityUnite) {
        super(quantity, price);
        this.name = name;
        this.quantityUnite = quantityUnite;
    }

    public String getQuantityUnite() {
        return quantityUnite;
    }

    public void setQuantityUnite(String quantityUnite) {
        this.quantityUnite = quantityUnite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", quantityUnite='" + quantityUnite + '\'' +
                ", quantity= '" + super.getQuantity() + '\''+
                ", price= '" + super.getPrice() + '\''+
                '}';
    }
}