public class ecomerce{
    public User user;
    public Product product;
    public int quantity;
    public ecomerce(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }
}
class Product{
    public String name;
    public double price;
    public int stock;
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
class User{
    public String name;
    public String address;
    public User(String name, String address) {  
        this.name = name;
        this.address = address;
    }
}

class OrderService {
    public void placeOrder(ecomerce order) throws Exception {
        if (order.product.stock < order.quantity) {
            throw new Exception("Product out of stock");
        }
        // Process payment (simulated)
        boolean paymentSuccess = true; // Simulate payment success
        if (!paymentSuccess) {
            throw new Exception("Payment failed");
        }
        // Update stock
        order.product.stock -= order.quantity;
        System.out.println("Order placed successfully for " + order.user.name);
    }
}