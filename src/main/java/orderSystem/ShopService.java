package orderSystem;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService () {
    }

    public ShopService (ProductRepo productRepo, OrderRepo orderRepo){
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public String showAllProducts(){
        //TODO
        return "";
    }

    public String showProductInformation (){
        //TODO
        return "";
    }

    public String showAllOrdersSortedByPriority(){
        //TODO
        return "";
    }




}
