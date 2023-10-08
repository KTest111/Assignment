package Module_3.Part2Steam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Lesson4AgeFilter {
    public static void main(String[] args) {
        Person person1 = new Person("Thura Linn", 23);
        Person person2 = new Person("Aung Aung", 24);
        Person person3 = new Person("Kyaw Kyaw", 25);
        Person person4 = new Person("Zaw Zaw", 26);
        Person person5 = new Person("Maw Maw", 27);
        Person person6 = new Person("Naw Naw", 28);
        Person person7 = new Person("Paw Paw", 29);
        Person person8 = new Person("Thaw Thaw", 30);


        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);


        personList.stream()
                .filter(person -> person.age > 24)
                .map(person -> person.name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}

