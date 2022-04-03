package orderSystem;

import java.util.Objects;

public class Product {

    private String productId;
    private String productName;
    private double price;
    private int stock;


    public Product(){
    }

    public Product(String productId, String productName, double price, int stock){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }





    @Override
    public String toString() {
        return  "product No: " + productId + "\t\t" +
                "product name: " + productName + "\t\t" +
                "price: " + price + "\t\t" +
                "number in stock: " + stock +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && stock == product.stock && Objects.equals(productId, product.productId) && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, price, stock);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
