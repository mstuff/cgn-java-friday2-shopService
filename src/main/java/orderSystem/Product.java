package orderSystem;

import java.util.Objects;

public class Product {

    private String productId;
    private String productName;
    private double price;
    private int numberInStore;


    public Product(){
    }

    public Product(String productId, String productName, double price, int numberInStore){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.numberInStore = numberInStore;
    }





    @Override
    public String toString() {
        return  "\tProductId: " + productId + "\t\t" +
                "productName: " + productName + "\t\t" +
                "price: " + price + "\t\t" +
                "numberInStore: " + numberInStore +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && numberInStore == product.numberInStore && Objects.equals(productId, product.productId) && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, price, numberInStore);
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

    public int getNumberInStore() {
        return numberInStore;
    }

    public void setNumberInStore(int numberInStore) {
        this.numberInStore = numberInStore;
    }
}
