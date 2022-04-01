package orderSystem;

import java.util.LinkedList;

public class OrderRepo {
    LinkedList<Order> listOfOrders;



    public  void addNewOrder(){
    }

    public  void removeOrderFromList(){
    }

    public  Order returnOrderByOrderId(){
        //TODO
        return new Order();
    }


    public LinkedList<Order> sortListByPriority(){
        //TODO
        return new LinkedList<>();
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "listOfOrders=" + listOfOrders +
                '}';
    }
}
