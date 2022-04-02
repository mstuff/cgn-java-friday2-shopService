package orderSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {

    List<Product> productsInStore = new ArrayList<>();

    public ProductRepo(){
    }

    public ProductRepo(Product product){
        this.productsInStore.add(product);
    }

    public List<Product> getAllProducts(){
        return productsInStore;
    }


    public void addNewProduct(Product newProduct){
        productsInStore.add(newProduct);
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

    @Override
    public String toString() {
        return  "productsInStore: \n" + productsInStore;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRepo)) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(productsInStore, that.productsInStore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsInStore);
    }
}
