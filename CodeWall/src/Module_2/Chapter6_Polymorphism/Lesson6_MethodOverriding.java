package Module_2.Chapter6_Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Lesson6_MethodOverriding {
    public static void main(String[] args) {
        new Child().dosomething(4);

    }
}
class Parent{
    void dosomething(int a){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    @Override
    void dosomething(int c){
        System.out.println("Child");
    }

}
