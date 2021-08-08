package java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "banh", 200));
        productList.add(new Product(2, "bia", 500));
        productList.add(new Product(3, "moi nhau", 300));
    }

    public static void Menu() {
        int choice = -1;
        do{
            System.out.println("Please enter choice \n"
            + "1. Display product list \n"
            + "2. Add product \n"
            + "3. Update product \n"
            + "4. Delete product \n"
            + "5. Search product \n"
            + "6. Sort product \n"
            + "Exit \n");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    displayListProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        }while (true);
    }

    public static void displayListProduct() {
        for (Product product :
                productList) {
            System.out.println(product);
        }
    }

    public static Product findById(int id){
        for (Product product:
             productList) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public static void addProduct() {
        int id;
        do{
            System.out.println("Please enter id");
            id = scanner.nextInt();
            scanner.skip("\\R");
        }while (findById(id) != null);
        System.out.println("Please enter name");
        String product = scanner.nextLine();
        System.out.println("Please enter price");
        int price = scanner.nextInt();
        productList.add(new Product(id, product, price));

    }

    public static void updateProduct(){
        System.out.println("Please enter id");
        int id = scanner.nextInt();
        Product product = findById(id);
        if (product != null){
            System.out.println("Please enter information update: \n"
            + "1. Name product \n"
            + "2. Price product \n"
            + "3. Back to menu \n");
            int choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice){
                case 1:
                    System.out.println("Please enter name");
                    String name = scanner.nextLine();
                    product.setNameProduct(name);
                    Menu();
                    break;
                case 2:
                    System.out.println("Please enter price");
                    int price = scanner.nextInt();
                    product.setPrice(price);
                    Menu();
                    break;
                case 3:
                    Menu();
                    break;
            }
        } else {
            System.out.println("Id not found");
            updateProduct();
        }
    }

    public static void deleteProduct(){
        System.out.println("Please enter id product");
        int id = scanner.nextInt();
        productList.remove(findById(id));
    }

    public static List<Product> searchProduct(){
        System.out.println("Please enter name product");
        List<Product> products = new ArrayList<>();
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++){
            if(name.equals(productList.get(i).getNameProduct())){
                products.add(productList.get(i));
            }
        }
        return products;
    }

    public static void main(String[] args) {
        Menu();
    }
}
