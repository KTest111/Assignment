package Module_2.Chapter5_Inheritance;

public class Lesson5_MatchingSuperParameter {
    public static void main(String[] args) {
Child4 child4 = new Child4(3);
Child4 child41 = new Child4(5);
    }
}
class Parent4{
    int a;
public Parent4(int a){
    this.a = a;
    System.out.println(this.a);
}
}
class Child4 extends Parent4{
    int b;
public Child4(int a){
    super(a);
    System.out.println("Child is working");
}
}