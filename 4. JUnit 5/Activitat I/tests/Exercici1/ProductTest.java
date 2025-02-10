package Exercici1;

import Exercici1.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void constructor() {
        Product product = new Product("Radio", 12.75, 7);
        assertEquals("Radio", product.getName());
        assertEquals(12.75, product.getPrice());
        assertEquals(7, product.getStock());
    }

    @Test
    void setPricePositive() {
        Product product = new Product("radio", 12.75, 7);
        product.setPrice(9.99);
        assertEquals(9.99, product.getPrice());
    }

    @Test
    void setPriceNegative() {
        Product product = new Product("radio", 12.75, 7);
        product.setPrice(-12);
        assertEquals(12.75, product.getPrice());
    }

    @Test
    void restockPositive() {
        Product product = new Product("radio", 12.75, 7);
        product.restock(10);
        assertEquals(17, product.getStock());
    }

    @Test
    void restockNegative() {
        Product product = new Product("radio", 12.75, 7);
        product.restock(-2);
        assertEquals(7, product.getStock());
    }

    @Test
    void sellTrue() {
        Product product = new Product("radio", 12.75, 7);
        assertTrue(product.sell(3));
        assertEquals(4, product.getStock());
    }

    @Test
    void sellFalse() {
        Product product = new Product("radio", 12.75, 7);
        assertFalse(product.sell(12));
        assertEquals(7, product.getStock());
    }

    @Test
    void sellNegative() {
        Product product = new Product("radio", 12.75, 7);
        assertFalse(product.sell(-2));
        assertEquals(7, product.getStock());
    }
}