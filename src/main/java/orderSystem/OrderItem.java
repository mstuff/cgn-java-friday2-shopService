package orderSystem;

public class OrderItem {
    protected int numberOfItems;
    protected Product product;

    public OrderItem(int numberOfItems, Product product) {
        this.numberOfItems = numberOfItems;
        this.product = product;

    }

    private boolean checkIfEnoughProductsInStore(){
        //TODO
        return true;
    }

    private boolean checkIfOrderedProductExists(){
        //TODO
        return true;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
