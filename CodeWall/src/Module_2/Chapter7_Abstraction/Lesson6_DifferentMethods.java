package Module_2.Chapter7_Abstraction;

interface Calculator{
    void cal(int number1,int number2);
}

public class Lesson6_DifferentMethods {

    void calculate(int a,int b,Calculator calculator){
        calculator.cal(a,b);
//        System.out.println(a+b);
    };

    public static void main(String[] args) {
        Lesson6_DifferentMethods obj = new Lesson6_DifferentMethods();
        obj.calculate(10, 20, new Calculator() {
            @Override
            public void cal(int num1,int num2) {
                System.out.println(num1+num2);
            }
        });
        obj.calculate(20, 10, new Calculator() {
            @Override
            public void cal(int num1,int num2) {
                System.out.println(num1-num2);
            }
        });
        obj.calculate(10, 20, new Calculator() {
            @Override
            public void cal(int num1,int num2) {
                System.out.println(num1*num2);
            }
        });
    }

}

