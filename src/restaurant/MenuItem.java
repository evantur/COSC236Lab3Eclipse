package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    // DONE change the name of 'price' to 'priceInDollars'
    // name changed to 'priceInDollars'
    private double priceInDollars;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
