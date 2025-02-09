package AggregateOperations.Problema3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> productes = Arrays.asList(
                new Product("Televisor", "Electrònica", 300),
                new Product("Cafetera", "Electrònica", 50),
                new Product("Pantalons", "Roba", 30),
                new Product("T-shirt", "Roba", 20)
        );

        Map<String, Double> mitjaPreuPerCategoria = productes.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));

        mitjaPreuPerCategoria.forEach((categoria, mitjana) ->
                System.out.println(categoria + ": " + mitjana));
    }
}
