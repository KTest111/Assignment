package Module_3.Chapter14Lambda_function;
interface Wtiteable {
    void show();
}
public class Lesson3ChangetoMethodRef {
void display(){
    System.out.println("This is displaying result");
}
static void display2(){
    System.out.println("Display2");
}

    public static void main(String[] args) {
        Wtiteable wt = new Lesson3ChangetoMethodRef()::display;; //instance method ref
        Wtiteable writ = Lesson3ChangetoMethodRef::display2; //static method ref
        writ.show();
            }
        }