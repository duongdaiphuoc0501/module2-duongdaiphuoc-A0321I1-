package java_collection_framework.bai_tap;

public class Product {
    private int id;
    private int nameProduct;
    private int price;

    public Product() {
    }

    public Product(int id, int nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNameProduct() {
        return this.nameProduct;
    }

    public void setNameProduct(int nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
