package Module_2.Chapter5_Inheritance;

public class Lesson4_MatchingSuper {
    public static void main(String[] args) {
Child3 child3 = new Child3();
    }
}
class Parent3{
public Parent3(){
    System.out.println("Parent is working");
}
}
class Child3 extends Parent3{
public Child3(){
    System.out.println("Child is working");
}
}