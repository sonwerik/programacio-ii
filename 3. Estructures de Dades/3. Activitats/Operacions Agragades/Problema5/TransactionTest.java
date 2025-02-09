package AggregateOperations.Problema5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionTest {
    public static void main(String[] args) {
        List<Transaction> transaccions = Arrays.asList(
                new Transaction("1", "client1", "Electrònica", 100, "2025-01-01"),
                new Transaction("2", "client2", "Roba", 50, "2025-01-02"),
                new Transaction("3", "client1", "Electrònica", 200, "2025-01-03")
        );

        Transaction clientMax = transaccions.stream()
                .max(Comparator.comparingDouble(Transaction::getTotalAmount))
                .orElseThrow();

        Map<String, Double> importPerCategoria = transaccions.stream()
                .collect(Collectors.groupingBy(Transaction::getCategory,
                        Collectors.summingDouble(Transaction::getTotalAmount)));

        String mesAmbMesVendes = transaccions.stream()
                .collect(Collectors.groupingBy(t -> t.getData().substring(0, 7), Collectors.summingDouble(Transaction::getTotalAmount)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");

        Map<String, List<Transaction>> transaccionsPerClient = transaccions.stream()
                .collect(Collectors.groupingBy(Transaction::getClientId));

        System.out.println("Client amb compra més alta: " + clientMax.getClientId());
        System.out.println("Import per categoria: " + importPerCategoria);
        System.out.println("Mes amb més volum de vendes: " + mesAmbMesVendes);
        System.out.println("Transaccions per client: " + transaccionsPerClient);
    }
}
