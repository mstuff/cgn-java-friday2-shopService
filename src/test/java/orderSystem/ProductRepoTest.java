package orderSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ProductRepoTest {



    @Test
    void addNewProductToRepo_whenProductAlreadyExists_shouldThrowException() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        Product product2 = new Product("13", "Zahnpasta", 2.99, 100);
        ProductRepo productRepo1 = new ProductRepo(product1);

        //when

        //then


    }

    @Test
    void addNewProductToRepo_whenRepoContainsProducts_shouldAddNewProduct() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        Product product2 = new Product("13", "Zahnpasta", 2.99, 100);
        ProductRepo productRepo1 = new ProductRepo(product1);

        //when
        productRepo1.addOneNewProductToRepo(product2);
        List<Product> actual = productRepo1.getAllProducts();

        //then
        List<Product> expected = List.of(new Product("12", "Seife", 1.99, 10),
                new Product("13", "Zahnpasta", 2.99, 100));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addNewProductToRepo_whenRepoEmpty_shouldAddNewProduct() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        ProductRepo productRepo1 = new ProductRepo();

        //when
        productRepo1.addOneNewProductToRepo(product1);
        List<Product> actual = productRepo1.getAllProducts();

        //then
        List<Product> expected = List.of(new Product("12", "Seife", 1.99, 10));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeProductByName_whenProductDoesNotExist_shouldThrowException() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        Product product2 = new Product("13", "Zahnpasta", 2.99, 100);
        Product product3 = new Product("14", "Handtuch", 7.99, 5);

        ProductRepo productRepo1 = new ProductRepo();
        productRepo1.addAnyNumberOfNewProductsToRepo(product1, product2);


    }

    @Test
    void removeProductByName_whenRepoIsEmpty_shouldThrowException() {
        //given
        ProductRepo productRepo1 = new ProductRepo();



    }

    @Test
    void removeProductByName_shouldRemoveFirstProduct() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        Product product2 = new Product("13", "Zahnpasta", 2.99, 100);
        Product product3 = new Product("14", "Handtuch", 7.99, 5);

        ProductRepo productRepo1 = new ProductRepo();
        productRepo1.addAnyNumberOfNewProductsToRepo(product1, product2, product3);


    }

    @Test
    void removeProductByName_shouldRemoveIntermediateProduct() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        Product product2 = new Product("13", "Zahnpasta", 2.99, 100);
        Product product3 = new Product("14", "Handtuch", 7.99, 5);

        ProductRepo productRepo1 = new ProductRepo();
        productRepo1.addAnyNumberOfNewProductsToRepo(product1, product2, product3);


    }

    @Test
    void removeProductByName_shouldRemoveLastProduct() {
        //given
        Product product1 = new Product("12", "Seife", 1.99, 10);
        Product product2 = new Product("13", "Zahnpasta", 2.99, 100);
        Product product3 = new Product("14", "Handtuch", 7.99, 5);

        ProductRepo productRepo1 = new ProductRepo();
        productRepo1.addAnyNumberOfNewProductsToRepo(product1, product2, product3);


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
    void returnNumberOfProductsInStoreByName() {
    }
}