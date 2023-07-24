package chapter1.basic_1;

public class lesson3_example2 {
    public static void main(String[] args) {


        int num = 3;
        float num1 = 5.5f;
        float num2 = 6.7f;
        double num3 = 8.8;
        double result;
        int res;

        result = num1 + num2; //float + float
        System.out.println(result);

        result = num1 + num; //float + int
        System.out.println(result);

        result = num2 + num3; //float + double
        System.out.println(result);
    }
}
