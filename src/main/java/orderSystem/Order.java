package orderSystem;

import java.util.ArrayList;

public class Order {
    protected String orderId;
    protected int priority;
    protected String customerName;
    protected ArrayList<OrderItem> listOfProductsOrdered;

    public Order(String orderId, int priority, String customerName, ArrayList<OrderItem> listOfProductsOrdered){
        this.orderId = orderId;
        this.customerName = customerName;
        this.listOfProductsOrdered = listOfProductsOrdered;

    }

    public Order (){
    }

    public void addItemToListOfOrderedProducts(){
    }

    public void removeItemFromListOfOrderedProducts(){
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<OrderItem> getListOfProductsOrdered() {
        return listOfProductsOrdered;
    }

    public void setListOfProductsOrdered(ArrayList<OrderItem> listOfProductsOrdered) {
        this.listOfProductsOrdered = listOfProductsOrdered;
    }
}
