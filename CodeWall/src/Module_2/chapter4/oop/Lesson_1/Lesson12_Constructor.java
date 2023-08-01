package Module_2.chapter4.oop.Lesson_1;

public class Lesson12_Constructor {
    Lesson12_Constructor(String name){
        System.out.println("I'm "+ name);


        }
        Lesson12_Constructor(){
            System.out.println("I'm default");
    }
    public static void main(String[] args) {
Lesson12_Constructor Obj = new Lesson12_Constructor("Kaung Htet Zaw");
Lesson12_Constructor Obj2 = new Lesson12_Constructor();
    }
}
/*
1. Default constructor / Zero Argument constructor : Classname(){}
2. Parameter constructor /                         : Classname(constrictor){}
***
 */
