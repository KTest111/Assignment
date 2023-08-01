package Module_2.Chapter6_Polymorphism;

public class Lesson2_MethodOverloading {
    static void show(int a){
        System.out.println(a);
    }
    static void show(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    static void show(int a, int b, int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        show(4);
        show(4,3);
        show(4,3,6);
    }
}
