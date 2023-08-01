package Module_2.Chapter6_Polymorphism;

public class Lesson8_FinalKeyword {
    public static final int NUMBER= 591;

    public static void main(String[] args) {
        System.out.println(Math.PI);
    }
}
class Use {
    public static void main(String[] args) {
        System.out.println(Lesson8_FinalKeyword.NUMBER);
        System.out.println(Math.PI);
    }
}
