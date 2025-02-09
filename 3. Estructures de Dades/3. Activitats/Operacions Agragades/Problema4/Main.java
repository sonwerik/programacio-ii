import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String inputFile = "fitxer.txt";
        String outputFile = "resultat.txt";

        try (Stream<String> lines = Files.lines(Paths.get(inputFile))) {
            List<String> users = lines
                    .map(linia -> linia.split(","))
                    .filter(parts -> parts.length == 2)
                    .filter(parts -> {
                        try {
                            return Integer.parseInt(parts[1].trim()) > 80;
                        } catch (NumberFormatException e) {
                            return false;
                        }
                    })
                    .sorted((p1, p2) -> {
                        int puntuacio1 = Integer.parseInt(p1[1].trim());
                        int puntuacio2 = Integer.parseInt(p2[1].trim());
                        return Integer.compare(puntuacio2, puntuacio1);
                    })
                    .map(parts -> String.join(",", parts))
                    .collect(Collectors.toList());

            Files.write(Paths.get(outputFile), users);

        } catch (IOException e) {
            System.err.println("Error llegint/escrivint el fitxer: " + e.getMessage());
        }
    }
}
