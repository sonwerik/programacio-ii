import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> persones = Arrays.asList(
                new Person("Pep", 20, "Olot"),
                new Person("Alberto", 16, "Barcelona"),
                new Person("Gines", 25, "Girona")
        );

        persones.stream()
                .filter(p -> p.getAge() > 18)
                .map(p -> new Person(p.getName().toUpperCase(), p.getAge(), p.getCity()))
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}