package orderSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void whenRepoContainsProducts_shouldAddNewProduct() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        Product product2 = new Product("13", "Zahnpasta", 2.99, 100);
        ProductRepo productRepo1 = new ProductRepo(product1);

        //when
        productRepo1.addNewProduct(product2);
        List<Product> actual = productRepo1.getAllProducts();

        //then
        List<Product> expected = List.of(new Product("12", "Seife", 1.99, 10),
                new Product("13", "Zahnpasta", 2.99, 100));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void whenRepoEmpty_shouldAddNewProduct() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        ProductRepo productRepo1 = new ProductRepo();

        //when
        productRepo1.addNewProduct(product1);
        List<Product> actual = productRepo1.getAllProducts();

        //then
        List<Product> expected = List.of(new Product("12", "Seife", 1.99, 10));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeProductByName() {
    }

    @Test
    void removeProductById() {
    }

    @Test
    void returnProductById() {
    }

    @Test
    void returnProductByName() {
    }

    @Test
    void returnNumberOfProductsInStoreById() {
    }

    @Test
    void returnNumberOfProductsInStoreByName() {
    }
}