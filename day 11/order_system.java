// Custom Exceptions
class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    PaymentFailedException(String msg) {
        super(msg);
    }
}

class OrderProcessingException extends Exception {
    OrderProcessingException(String msg) {
        super(msg);
    }
}

// Classes
class Product {
    String name;
    int stock;
    double price;

    Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

class User {
    String name;
    String address;

    User(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Order {
    Product product;
    User user;
    int quantity;

    Order(Product product, User user, int quantity) {
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }
}

class OrderService {

    public void placeOrder(Order order)
            throws OutOfStockException, PaymentFailedException, OrderProcessingException {

        if (order.product.stock < order.quantity)
            throw new OutOfStockException("Product out of stock");

        double total = order.product.price * order.quantity;

        if (total > 1000)
            throw new PaymentFailedException("Payment failed");

        if (order.quantity > 5)
            throw new OrderProcessingException("Order processing failed");

        order.product.stock -= order.quantity;

        System.out.println("Order placed successfully for " + order.user.name);
    }
}

public class order_system {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 10, 900);
        User u = new User("Alice", "Chennai");
        Order o = new Order(p, u, 2);

        OrderService os = new OrderService();

        try {
            os.placeOrder(o);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}