package chapter1.basic_1.Chapter2_Operator;

public class Operator {
    public static void main(String[] args) {
        // Arithmatic operator;
        int a = 5;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Comparision operator;
        boolean condition = true;
        int c = 2;
        int d = 3;
        boolean conds = a < b;
        System.out.println(conds);

        // Logical operator;
        // Same true display true;
        //        // Same false display false;

        //        // Same 1 1 = 0
        //        //      0 0 = 0
        //        // Not same 0 1 = 1
        //        //          1 0 = 1
        boolean result = 3 < 5 && 6 > 12;
        System.out.println(result);
        // Bitwise;
        // Same true display true;
        // Same false display false;
        // Same 1 1 = 0
        //      0 0 = 0
        // Not same 0 1 = 1
        //          1 0 = 1
        boolean result2 = true | false;
        System.out.println(result2);

        // Shift;
        int result3 = 10 << 2;
        System.out.println(result3);

        int result4 = 10 >> 3;
        System.out.println(result4);

        // Assignmant operator;
        int abc = 7;
        abc += 6;
        System.out.println(abc);

        abc -= 2;
        System.out.println(abc);

        abc *= 3;
        System.out.println(abc);

        abc /= 5;
        System.out.println(abc);

        // Unary operator;
        int num = 31;
        int num2 = ++num;
        System.out.println(num2);


        // Ternary operator;
        int f = (3>4)?3:4;
        Object blah = (34<300)?false:true;
        System.out.println(blah);
    }
}
