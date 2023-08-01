package Module_2.Chapter7_Abstraction;

interface Calculator1{
    void cal(int a,int b);
}
class Sum implements Calculator1{

    @Override
    public void cal(int num1,int num2) {
        System.out.println(num1+num2);
    }
}
class Sub implements Calculator1{

    @Override
    public void cal(int n1,int n2) {
        System.out.println(n1-n2);
    }
}


public class Lesson7_DifferentMethodsMedium {
    void calculate(int a,int b,Calculator1 calculator1){
        calculator1.cal(a,b);
    }

    public static void main(String[] args) {
        Lesson7_DifferentMethodsMedium obj = new Lesson7_DifferentMethodsMedium();
        obj.calculate(1, 2, new Calculator1() {
            @Override
            public void cal(int a, int b) {
                System.out.println(a*b);
            }
        });

        obj.calculate(3,2,new Sum());

        obj.calculate(5,2,new Sub());


    }
}
