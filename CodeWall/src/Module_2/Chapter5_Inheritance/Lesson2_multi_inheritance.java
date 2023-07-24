package Module_2.Chapter5_Inheritance;

public class Lesson2_multi_inheritance {
    public static void main(String[] args) {

Parent1 parent = new Parent1();
        System.out.println(parent.a+ parent.b);
Grandchild1 child = new Grandchild1();
        System.out.println(child.a + child.b + child.c);
    }
}
class Grandparent1{
int a = 1;
}
class Parent1 extends Grandparent1{
int b = 2;
}
class Grandchild1 extends Parent1{
    int c = 3;
}
