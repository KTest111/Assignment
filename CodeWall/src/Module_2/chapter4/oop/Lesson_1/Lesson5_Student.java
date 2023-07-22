package Module_2.chapter4.oop.Lesson_1;

public class Lesson5_Student {
    int id ;
    String name;
    int age;
    String School = "CodeWall";
    public static void main(String[] args) {
        Lesson5_Student student_1 = new Lesson5_Student();
        student_1.id = 5;
        student_1.name = "Kaung Htet Zaw";
        student_1.age = 20;

        System.out.println();

        Lesson5_Student student_2 = new Lesson5_Student();
        student_2.id = 6;
        student_2.name = "Blah Blah Blah";
        student_2.age = 21;

        System.out.println();

        System.out.println(" Student_1 ID =" + student_1.id);
        System.out.println(" Student_2 ID =" + student_2.id);

        System.out.println();

        System.out.println(" Student_1 Name =" + student_1.name);
        System.out.println(" Student_2 Name =" + student_2.name);

        System.out.println();

        System.out.println(" Student_1 Age =" + student_1.age);
        System.out.println(" Student_2 Age =" + student_2.age);

        System.out.println();

        System.out.println(" Student_1 School =" + student_1.School);
        System.out.println(" Student_2 School =" + student_2.School);

        System.out.println();

        student_1.School = "Technologies";
        System.out.println("Student_1's previous School =" + student_1.School);
        System.out.println(student_2.School);

    }
}