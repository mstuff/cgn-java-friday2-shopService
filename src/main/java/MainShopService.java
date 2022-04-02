import orderSystem.Product;
import orderSystem.ProductRepo;

public class MainShopService {
    public static void main(String[] args) {
        Product product1 = new Product("111", "Seife", 1.99, 15);
        Product product2 = new Product("171", "Zahnpasta", 3.89, 15);
        System.out.println(product1);

        ProductRepo productRepo1 = new ProductRepo(product1);
        productRepo1.addNewProduct(product2);
        System.out.println(productRepo1.getAllProducts());
        System.out.println(productRepo1);

    }
}
