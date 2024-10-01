
public class Product {
     protected String name;
    protected double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void orderProduct(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println("Ordered " + quantity + " of " + name);
        } else {
            System.out.println("Not enough stock for " + name);
        }
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Stock: " + stock);
    }
}


