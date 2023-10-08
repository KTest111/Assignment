package Module_3.Chapter13Innerclass;
public class Lesson2Localinnerclass {
    private int abc = 9;
    void sum(){
        class Inner{
            void display(){
                System.out.println(abc);
            }
        }
        Inner obj = new Inner();
        obj.display();
    }

    public static void main(String[] args) {
        Lesson2Localinnerclass obj = new Lesson2Localinnerclass();
        obj.sum();
    }
}
