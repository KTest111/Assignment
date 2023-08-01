package Module_2.Chapter7_Abstraction;
abstract class Person3{
    abstract void calculate();
}

class People{
    void doIt(){
        System.out.println("blah blah");
    }
}

class Child3 extends Person3{
    @Override
    void calculate() {
        System.out.println("Task 3");
    }
}
class Child4 extends Person3{
    @Override
    void calculate() {
        System.out.println("Task 4");
    }
}

public class Lesson3AbstractMedium {
    public static void main(String[] args) {
        People people = new People();
        people.doIt();

        People people1 = new People();
        people1.doIt();

        Person3 person3 = new Person3() {
            @Override
            void calculate() {
                System.out.println("Task 1");
            }
        };
        person3.calculate();

        Person3 person31 = new Person3() {
            @Override
            void calculate() {
                System.out.println("Task 2");
            }
        };
        person31.calculate();

        Person3 person32 = new Child3();
        person32.calculate();

        Person3 person33 = new Child4();
        person33.calculate();

    }
}



