package AggregateOperations.Problema2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumaParells = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int max = numbers.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        int min = numbers.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);

        double mitjana = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        long positius = numbers.stream().filter(n -> n > 0).count();

        System.out.println("Suma parells: " + sumaParells);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mitjana: " + mitjana);
        System.out.println("Positius: " + positius);
    }
}
