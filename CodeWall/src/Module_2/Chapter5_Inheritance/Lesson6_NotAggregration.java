package Module_2.Chapter5_Inheritance;

public class Lesson7_Aggregration {
    public static void main(String[] args) {
Student student = new Student();
    }
}
class Address{
String city;
String Street;
int Number;
public Address(String city, String Street , int number ){
    this.city = city;
    this.Street = Street;
    this.Number = Number;
}
}
class Student{
    int id;
String name;
int age;

    public Student(int id, String name, int age, String c,String s, int n) {
        super(c,s,n);
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
