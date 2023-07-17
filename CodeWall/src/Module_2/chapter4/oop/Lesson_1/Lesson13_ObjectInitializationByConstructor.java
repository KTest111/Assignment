package Module_2.chapter4.oop.Lesson_1;

public class Lesson13_ObjectInitializationByConstructor {
    public static void main(String[] args) {
    Student roll1 = new Student("Kaung", 20,"Male");
    Student roll2 = new Student("Shin",18,"Female");
        System.out.println(roll1.name);
        System.out.println(roll1.age);
        System.out.println(roll1.Gender);
        System.out.println();
        System.out.println(roll2.name);
        System.out.println(roll2.age);
        System.out.println(roll2.Gender);
    }
}
class Student{
    String name;
    int age;
    String Gender;

    public Student(String name, int age, String Gender) {
        this.name = name;
        this.age = age;
        this.Gender = Gender;
    }
}