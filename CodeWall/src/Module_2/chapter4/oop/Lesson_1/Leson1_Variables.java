package Module_2.chapter4.oop.Lesson_1;

public class Leson1_Variables {
    int number1 = 5;  // global instance variable
    static int number2 = 45;  // global static variable


    public static void main(String[] args) {
        System.out.println(number2);

        // data type variable names = value;
        int a = 5;   //   local variable
         //Type objectName = object (new constructor);
        Leson1_Variables obj = new Leson1_Variables();
        System.out.println(obj.number1);




        // OOP intro
        // Class
        // Object
        // Inheritance
        // Polymorphism
        // Abstraction
        // Encapsulation
    }
}
