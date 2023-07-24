package Module_2.Chapter5_Inheritance;

public class Lesson1_SingleInheritance {
    public static void main(String[] args) {
        System.out.println(new child().b+new parent().a);
        child child = new child();
        System.out.println(child.a+child.b);
    }
    }
    class parent{

    int a = 1;
    }
class child extends parent{
    int b = 2;
}

// single inheritance
// multi-inheritance
// hierarchical inheritance
// multiple inheritance
// hybrid inheritance