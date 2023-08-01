package Module_2.Chapter6_Polymorphism;

public class Lesson7_Typecasting {
    public static void main(String[] args) {
        int a = 4;
        Parent1 obj = new Parent1();

        int d = 6;
        double e = d;
        Parent1 obj2 = new Child1();
        obj.doit();

        double f = 4;
        int g = (int)f;
        Child1 obj3 = (Child1) new Child1();
        obj3.doit();
    }
}
class Parent1{
    void doit(){

    }
}class Child1 extends Parent1{
    void doit(){

    }
}
