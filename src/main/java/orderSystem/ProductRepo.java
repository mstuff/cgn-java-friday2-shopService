package orderSystem;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    ArrayList<Product> productsInStore;



    public ProductRepo(ArrayList<Product> productsInStore){
        this.productsInStore = productsInStore;

    }


    public  void addNewProduct(){
    }

    public  void removeProductByName(){
    }

    public  void removeProductById(){
    }

    public  Product returnProductById(){
        //TODO
        return new Product();
    }

    public  Product returnProductByName(){
        //TODO
        return new Product();
    }

    public  int returnNumberOfProductsInStoreById(){
        //TODO
        return 0;
    }

    public  int returnNumberOfProductsInStoreByName(){
        //TODO
        return 0;
    }


}
