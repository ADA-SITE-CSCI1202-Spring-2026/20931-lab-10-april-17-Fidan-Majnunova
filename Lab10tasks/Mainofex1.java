import java.util.*;
import java.util.function.Predicate;
public class Mainofex1 {

    public static void main(String[] args) {
        ex1 ex1Instance = new ex1();
        List<ex1.Product> products = new ArrayList<>();
        products.add(ex1Instance.new Product("Laptop", 999.99, true));
        products.add(ex1Instance.new Product("Headphones", 49.99, true));
        products.add(ex1Instance.new Product("Mouse", 19.99, false));
        products.add(ex1Instance.new Product("Keyboard", 29.99, true));
        products.add(ex1Instance.new Product("Monitor", 199.99,false));
        
        Predicate<ex1.Product> isAffordable = p -> p.price < 50 && p.inStock;

        products.removeIf(isAffordable);

        System.out.println("Affordable and in-stock products:");
        for (ex1.Product product : products) {
            System.out.println(product);
        }
    }

}
