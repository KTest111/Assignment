package Module_2.Chapter7_Abstraction;

public class Lesson5_InterfaceMedium {
    public static void main(String[] args) {
        Testable2 testable2 = new Testable2() {
            @Override
            public void cal() {
                System.out.println("Tasks");
            }
        };
        testable2.cal();

        Testable2 testable21 = new Child5();
        testable21.cal();

        Testable2 testable22 = new Child6() {

            @Override
            public void cal() {
                System.out.println("Task 2");
            }
        };
        testable22.cal();

    }
}

interface Testable2{
    void cal();
}



class Child5 implements Testable2{


    @Override
    public void cal() {
        System.out.println("Task 1");
    }
}

abstract class Child6 implements  Testable2{

}


