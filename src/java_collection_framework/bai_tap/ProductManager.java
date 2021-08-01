package java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
        Product product1 = new Product();
        products.set(products.size(), product);
    }

    public static void main(String[] args) {

    }
}
