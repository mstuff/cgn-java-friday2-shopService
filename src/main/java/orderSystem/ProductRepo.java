package orderSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
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



    public void addOneNewProductToRepo(Product newProduct){
        //TODO: throw Exception if Product already exists
        productsInStore.add(newProduct);
    }

    public void addAnyNumberOfNewProductsToRepo(Product... productVar){
        //TODO: throw Exception if Product already exists
        for(Product newProduct : productVar)
        productsInStore.add(newProduct);
    }

    public boolean addToStockById(String productId, int addToStock) throws NoSuchElementException{
        //TODO ensure that addToStock is >= 0
        for (Product currentProduct : this.productsInStore) {
            if (currentProduct.getProductId() == productId) {
                currentProduct.setStock(currentProduct.getStock()+addToStock);
                return true;
            }
        } throw new NoSuchElementException("There is no such product in store");

    }

    public boolean removeFromStockById(String productId, int removeFromStock) throws NoSuchElementException{
        //TODO ensure that addToStock is >= 0 and that getStock() >= removeFromStock
        for (Product currentProduct : this.productsInStore) {
            if (currentProduct.getProductId() == productId) {
                currentProduct.setStock(currentProduct.getStock()-removeFromStock);
                return true;
            }
        } throw new NoSuchElementException("There is no such product in store");

    }

    public  void removeProductByName(){
    }

    public  void removeProductById(){
    }

    public  Product returnProductById(String productId) throws NoSuchElementException{
        for (Product currentProduct : this.productsInStore) {
            if (currentProduct.getProductId() == productId) {
                return currentProduct;
            }
        } throw new NoSuchElementException("There is no such product in store");
    }

    public  Product returnProductByName(String productName) throws NoSuchElementException{
        for (Product currentProduct : this.productsInStore) {
            if (currentProduct.getProductName() == productName) {
                return currentProduct;
            }
        } throw new NoSuchElementException("There is no such product in store");
    }

    public  int returnNumberInStockByName(String productName) throws NoSuchElementException{
        for (Product currentProduct : this.productsInStore) {
            if (currentProduct.getProductName() == productName) {
                return currentProduct.getStock();
            }
        } throw new NoSuchElementException("There is no such product in store");
    }

    public  int returnNumberInStockByProductId(String productId) throws NoSuchElementException{
        for (Product currentProduct : this.productsInStore) {
            if (currentProduct.getProductId() == productId) {
                return currentProduct.getStock();
            }
        } throw new NoSuchElementException("There is no such product in store");
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

    public List<Product> getProductsInStore() {
        return productsInStore;
    }


}
