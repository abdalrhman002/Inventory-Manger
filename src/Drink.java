public class Drink extends Item {
    private String brand;
    private String containerType;
    private double volume;
    private String volumeUnite;

    public Drink(int quantity, double price, String brand, String containerType,
                 double volume, String volumeUnite) {
        super(quantity, price);
        this.brand = brand;
        this.containerType = containerType;
        this.volume = volume;
        this.volumeUnite = volumeUnite;
    }

    public String getBrand() {
        return brand;
    }

    public String getContainerType() {
        return containerType;
    }

    public double getVolume() {
        return volume;
    }

    public String getVolumeUnite() {
        return volumeUnite;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "brand='" + brand + '\'' +
                ", containerType='" + containerType + '\'' +
                ", volume=" + volume +
                ", volumeUnite='" + volumeUnite + '\'' +
                ", quantity= '" + super.getQuantity() + '\''+
                ", price= '" + super.getPrice() + '\''+
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

}
