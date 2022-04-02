package orderSystem;

public class CustomerService {
    private ShopService shopService;

    public CustomerService (ShopService shopService){
        this.shopService = shopService;
    }

    public void placeOrder(){
    }
}
