package Module_2.Chapter7_Abstraction;

interface Testable{

    //abstract method
    void cal();

    //instance method
    default void eat(){}

    //static method
    static void drink(){}
}
public class Lesson4InterfaceSyntax {
    public static void main(String[] args) {
        Testable testable = new Testable() {

            @Override
            public void cal() {
                System.out.println("Task 1");
            }
        };
        testable.cal();

        Testable testable1 = new Testable() {

            @Override
            public void cal() {
                System.out.println("Task 2");
            }
        };
        testable1.cal();
    }
}
