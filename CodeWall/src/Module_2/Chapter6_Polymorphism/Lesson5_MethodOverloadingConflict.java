package Module_2.Chapter6_Polymorphism;

public class Lesson5_MethodOverloadingConflict {
    static void calculate(int a, double b){
        System.out.println(a);
        System.out.println(b);
    }
    static  void calculate(double a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        calculate(5.5,4);
    }
}
