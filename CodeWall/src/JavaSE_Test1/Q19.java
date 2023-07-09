package JavaSE_Test1;

public class Q19 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
        System.out.println();
    }
}
