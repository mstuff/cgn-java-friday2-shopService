package orderSystem;

import java.util.NoSuchElementException;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService () {
    }

    public ShopService (ProductRepo productRepo){
        this.productRepo = productRepo;

    }

    public ShopService (ProductRepo productRepo, OrderRepo orderRepo){
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public String showAllProducts(){
       return this.productRepo.toString();
    }

    public String showProductInformationById (String productId){
        try {
            return "Information about product No. " + productId + ": \n" +
                    productRepo.returnProductById(productId).toString();
        } catch (NoSuchElementException e) {
            return "no product with this product No. found";
        }
    }

    public String showAllOrdersSortedByPriority(){
        //TODO
        return "";
    }




}
