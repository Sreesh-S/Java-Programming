interface Billabe {
    double calculate();
}

class Product implements Billabe {
    private int productid;
    private String name; // Corrected variable name
    private int quantity;
    private double unitprice;

    public Product(int id, String productName, int qty, double price) {
        productid = id;
        name = productName;
        quantity = qty;
        unitprice = price;
    }

    public double calculate() {
        return quantity * unitprice;
    }

    public void displayProduct() {
        System.out.printf("%-10d%-10s%-10d%-10.2f%-10.2f%n", productid, name, quantity, unitprice, calculate());
    }
}

public class BillWithInterface {
    public static void main(String[] args) {
        Product product1 = new Product(101, "A", 2, 25.0);
        Product product2 = new Product(102, "B", 1, 100.0);

        double netAmount = product1.calculate() + product2.calculate();

        System.out.println("Order no date:"); // You might want to add actual order number and date here
        System.out.println("Product ID Name     Quantity  Unit Price Total");
        product1.displayProduct();
        product2.displayProduct();
        System.out.printf("%-40s%-10.2f%n", "Net Amount", netAmount);
    }
}