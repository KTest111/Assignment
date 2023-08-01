package Module_1.basic_1.Chapter3_Arrays;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Random random = new Random();
        int a = random.nextInt(100);
        System.out.println(a);
    }

}
