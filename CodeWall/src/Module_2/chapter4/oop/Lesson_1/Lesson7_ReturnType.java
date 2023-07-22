package Module_2.chapter4.oop.Lesson_1;

public class Lesson7_ReturnType {

    static int calculate() {
        int a = 3;
        int b = 4;
        int result = a + b;
        System.out.println(result);
        return 4;
    }

    static int sum() {
        System.out.println("Another value");
        return 4;
    }

    static String name(){
        return "Kaung Htet";
}

    public static void main(String[] args) {
        calculate();
        System.out.println(sum());
        System.out.println(name());

        int a = 3;
        String name = "Kaung Htet Zaw";

        sum();
        String result = name();
        System.out.println(result);
    }
}
