package Module_2.chapter4.oop.Lesson_1;

public class Lesson3_object_initialition {
    int number;
    String sometext;

    public static void main(String[] args) {
    int a = 5; // variable initialization
        // object create

        // object
        // instance
        // reference
        Lesson3_object_initialition obj = new Lesson3_object_initialition();
        obj.number = 6;
        obj.sometext = "Hello World";
        System.out.println(obj.number);
        System.out.println(obj.sometext);
    }
}
