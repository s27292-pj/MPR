import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(22,"Daniel");

        /*
        try {
            Person person2 = new Person(36, "Adam");
        } catch(InvalidAgeException e){
            System.out.println("Złapano wyjątek: "+ e.getMessage());
        }
        */

        Person person2 = new Person(36, "Adam");

        Person person3 = new Person(41,"Konrad");

        List<Person> personList = List.of(person1,person2,person3);
        List<Person> anotherPersonList = new ArrayList<>();

        anotherPersonList.add(person1);
        anotherPersonList.add(person2);
        anotherPersonList.add(person3);

        // person1.setAge(-50);

        System.out.println("Imie: " + person1.getName());
        System.out.println("Wiek: " + person1.getAge());

        System.out.println("Lista 1: " + personList);

        System.out.println("Lista 1: " + anotherPersonList);

        Set<Person> personSet = Set.of(person1, person2, person3);
        Set<Person> anotherPersonSet = new HashSet<>(); // set nie jest indeksowalny i nie moga powtarzac sie w nim elementy chyba ze dodane do hash seta to nie wywala bledy a po prostu nei dodaje tego elementu

        anotherPersonSet.add(person1);
        anotherPersonSet.add(person1);

        System.out.println("Set 1:" + personSet);
        System.out.println("Set 1:" + anotherPersonSet);

        Map<Integer, Person> personMap = Map.of(1,person1,2,person2,3,person3);
        Map<Integer, Person> anotherPersonMap = new HashMap<>();
        anotherPersonMap.put(1,person1);
        anotherPersonMap.put(2,person2);
        anotherPersonMap.put(3,person3);

        System.out.println("Map 1:" + personMap);
        System.out.println("Map 2:" + anotherPersonMap);

        List<Integer> ageList = personList.stream()
                .map(Person::getAge).collect(Collectors.toList());

        System.out.println(ageList);


    }
}