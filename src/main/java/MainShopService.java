import orderSystem.Product;
import orderSystem.ProductRepo;
import orderSystem.ShopService;

import java.util.List;

public class MainShopService {
    public static void main(String[] args) {
        Product product1 = new Product("111", "Seife", 1.99, 15);
        Product product2 = new Product("171", "Zahnpasta", 3.89, 15);

        ProductRepo productRepo1 = new ProductRepo();
        productRepo1.addAnyNumberOfNewProductsToRepo(product1, product2);
        System.out.println(productRepo1.addToStockById("111", 100));
        System.out.println(productRepo1);

        ShopService shopService1 = new ShopService(productRepo1);
        String allProducts = shopService1.showAllProducts();
        System.out.println(allProducts);
        System.out.println(shopService1.showProductInformationById("11"));

    }
}
