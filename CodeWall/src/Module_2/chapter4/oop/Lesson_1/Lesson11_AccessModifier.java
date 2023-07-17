package Module_2.chapter4.oop.Lesson_1;

public class Lesson11_AccessModifier {
    private int bill = 5000;
    protected int balance = 30000;
    public int bal = 2000;
    int bil = 300;
    static int number = 3;

    public static void main(String[] args) {
        Lesson11_AccessModifier obj = new Lesson11_AccessModifier();
        System.out.println(obj.bill);
        System.out.println(obj.balance);
        System.out.println(obj.bal);
        System.out.println(obj.bil);
    }
}
class SameDirclass{
    void show(){
        Lesson11_AccessModifier ob = new Lesson11_AccessModifier();
   //     System.out.println(ob.bill);  //private
        System.out.println(ob.balance); //protected
        System.out.println(ob.bal);     //public
        System.out.println(ob.bil);     //default
    }
}
