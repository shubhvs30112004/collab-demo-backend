package service;
import model.Product;
public class ProductService {
    public boolean createProduct(String name, double price) {

        //validating product
        if (name == null || name.isEmpty() || price < 0) {
            return false;
        }

        Product product = new Product(name, price);
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Product created successfully:");

        return true;
    }
}
