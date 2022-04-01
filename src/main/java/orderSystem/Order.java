package orderSystem;

public class Order {
    Product orderedProduct;
    int numberOfOrderedProducts;

    public Order(Product orderedProduct, int numberOfOrderedProducts){
        this.orderedProduct = orderedProduct;
        this.numberOfOrderedProducts = numberOfOrderedProducts;



    }

    private boolean checkIfOrderedProductIsAvailable(){
        //TODO
        return true;
    }



}
