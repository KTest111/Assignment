package Module_2.chapter4.oop.Lesson_1;

public class Lesson6_Method {

    // instance method // non- static method
    void display() {
        System.out.println("this is display");

    }
    //static method
    static void show(){
        System.out.println("My name is Kaung Htet Zaw");
        System.out.println("I am 20 years old");
    }

    public static void main(String[] args) {

        Lesson6_Method obj = new Lesson6_Method();
        obj.display();
        obj.display();
        Lesson6_Method.show();
        Lesson6_Method.show();

    }
}
