package Module_2.Chapter5_Inheritance;

public class Lesson6_NotAggregration {
    public static void main(String[] args) {
Student student = new Student(2,"Kaung Htet Zaw",20,"Mayangon","Mawyawaddi",127);

    }
}
class Address{
     String street;
    String number;
    String city;
String Street;
int Number;
public Address(String city, String Street , int number ){
    this.city = city;
    this.Street = Street;
    this.Number = Number;
}
}
class Student extends Address{
    int id;
String name;
int age;


    public Student(int id, String name, int age, String c, String s, int n) {
        super(c,s,n);
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
