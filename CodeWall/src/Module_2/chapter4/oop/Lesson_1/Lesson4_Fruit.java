package Module_2.chapter4.oop.Lesson_1;

public class Lesson4_Fruit {
    String name;
    String colour;
    String size;

    public static void main(String[] args) {
        Lesson4_Fruit fruit1 =new Lesson4_Fruit();
        fruit1.name = "Apple";
        fruit1.colour = "Red";
        fruit1.size = "Small";

        System.out.println(fruit1);


        Lesson4_Fruit fruit2 = new Lesson4_Fruit();
        fruit2.name = "Orange";
        fruit2.colour = "orange";
        fruit2.size = "Medium";

        System.out.println(fruit2.name);
    }
}
