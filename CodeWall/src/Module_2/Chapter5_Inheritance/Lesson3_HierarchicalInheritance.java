package Module_2.Chapter5_Inheritance;

public class Lesson3_HierarchicalInheritance {
    public static void main(String[] args) {
Parent2 parent2 = new Parent2();
        System.out.println(parent2.a+parent2.b);
        Grandchild2 grandchild2 = new Grandchild2();
        System.out.println(grandchild2.a + grandchild2.b + grandchild2.c );
    }
}
class Grandparent2{
int a = 1;
}
class Parent2 extends Grandparent2{
int b = 2;
}
class Grandchild2 extends Parent2{
int c = 3;
}