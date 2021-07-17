package Predicates;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("lola", 10));
        persons.add(new Person("olga", 20));
        persons.add(new Person("oleg", 100));

//        persons.stream().forEach( p -> System.out.println(p) );
        persons.stream().filter(p -> p.getAge() >= 18).
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                map(p -> p.getName()).
                forEach(System.out::println);

        double average = persons.stream().filter(p -> p.getAge() >= 18).
                mapToInt(p -> p.getAge()).
                average().getAsDouble();

        System.out.println(average);
    }
}
