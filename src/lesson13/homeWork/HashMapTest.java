package lesson13.homeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, Animal> map = new HashMap<>();

        map.put("first", new Cat("Baks", "Grey"));
        map.put("double", new Cat("Vaska", "white"));
        map.put("three", new Cat("Pushok", "black"));
        map.put("four", new Dog("Reks", 24));
        map.put("four", new Parrot("Kesha", "africa"));

        System.out.println(map);

        HashMap<Person, List<? extends Animal>> map2 = new HashMap<>();
        map2.put(new Person("Kolya"), Arrays.asList(
                new Cat("Baks","Grey"),
                new Dog("Reks",23),
                new Parrot("Kesha","Africa")
        ));
        map2.put(new Person("Anastasiya"),Arrays.asList(
                new Cat("Mashka","Black"),
                new Cat("Moska","White"),
                new Cat("puska","White"),
                new Cat("buska","brown")
        ));
        System.out.println("************");

        System.out.println(map2);
        for (Person person : map2.keySet()){
            System.out.println(person+ " имеет у себя: ");

            for (Animal animal : map2.get(person)){
                System.out.println(" "+animal);

            }
        }


    }
}
