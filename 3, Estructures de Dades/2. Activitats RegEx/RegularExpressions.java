import java.util.regex.*;

public class RegexPatterns {
    public static void main(String[] args) {
        String text = """
                En Joan està aprenent Java, però encara no sap fer servir classes i objectes.
                El seu NIF és 34567890M, però un amic seu té el 98765432L.
                Ahir va escriure aquest comentari en el seu codi: // TODO: Refactoritzar aquesta funció.
                Va descobrir paraules curioses com "gypsy" i "crypt", que no tenen vocals.
                Quan escriu, moltes frases comencen amb "fga": fgaProject és el seu últim projecte.
                També va escriure una cadena: StartUp, que no comença amb cap número.
                Va intentar crear noms com "Alpha" o "Beta1", però només "Beta" té exactament 4 lletres.
                Hi ha textos com "Aquesta frase és curiosa." que no acaben amb números.
                Quan programa, a vegades afegeix un 2 al codi, però sempre s'assegura que no el segueixi un 3, com passa en 2022.
                En un fitxer es troba amb seqüències com "xxxzzz" que només contenen les lletres x i z.
                """;

        // 1. La paraula Java
        findPattern(text, "\\bJava\\b", "La paraula Java");

        // 2. Un NIF qualsevol (8 dígits seguits per una lletra)
        findPattern(text, "\\b\\d{8}[A-HJ-NP-TV-Z]\\b", "Un NIF qualsevol");

        // 3. Un comentari d'una sola línia en un fitxer de codi font Java
        findPattern(text, "//.*", "Un comentari d'una sola línia");

        // 4. Paraules que no continguin cap vocal
        findPattern(text, "\\b[^aeiouAEIOU\\s]+\\b", "Paraules sense vocals");

        // 5. Si el String cadena comença per “fga” o “Fga”
        findPattern(text, "^(fga|Fga).*", "Comença per 'fga' o 'Fga'");

        // 6. El String cadena no comença per un dígit
        findPattern(text, "^[^\\d].*", "No comença per un dígit");

        // 7. String format per un mínim de 4 i un màxim de 7 lletres majúscules o minúscules
        findPattern(text, "^[a-zA-Z]{4,7}$", "Té entre 4 i 7 lletres");

        // 8. String que no acaba amb un dígit
        findPattern(text, ".*[^\\d]$", "No acaba amb un dígit");

        // 9. Conté un 2 i aquest 2 no està seguit per un 3
        findPattern(text, "2(?!3)", "Conté un 2 que no està seguit per un 3");

        // 10. Solament contenen els caràcters x o z
        findPattern(text, "^[xzXZ]+$", "Només conté caràcters x o z");
    }

    private static void findPattern(String text, String regex, String description) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(description);
        while (matcher.find()) {
            System.out.println(" Trobat: " + matcher.group());
        }
        System.out.println();
    }
}