package Module_2.chapter4.oop.Lesson_1;

public class Lesson9_Parameters {
    static void calculate(int num1,int num2){
        int a = num1;
        int b = num2;
        int result = a+b;
        System.out.println(num1 + num2);
    }
    static void fullname(String Firstname,String Lastname){
        System.out.println(Firstname + Lastname);
    }

    public static void main(String[] args) {
        calculate(2,2);
        calculate(5,2);
        calculate(2,8);

        fullname("Kaung ","Htet");
    }
}
