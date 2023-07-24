package Module_2.Chapter5_Inheritance;
import java.sql.SQLOutput;
public class Lesson7_Aggregation {
    public static void main(String[] args) {
        Address address = new Address("Mayangone", "Mawyawaddi", 127);
        Student1 student1 = new Student1(1,"Kaung Htet Zaw",20,address);
        System.out.println("id = "+ student1.id);
        System.out.println("Name = " + student1.name);
        System.out.println("Age = " +student1.age);
        System.out.println();
        System.out.println("City = " + address.city);
        System.out.println("Street = " +address.street);
        System.out.println("Number = " +address.number);
    }
}
class Address1 {
    String city;
    String street;
    int number;
    public Address1(String city, String street, int number) {
        super();
        this.city = city;
        this.street = street;
        this.number = number;
    }
}
class Student1{
    int id;
    String name;
    int age;
    Address add;
    public Student1(int id, String name, int age, Address add) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.add = add;
    }
        }




