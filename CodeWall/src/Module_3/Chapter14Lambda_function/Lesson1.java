package Module_3.Chapter14Lambda_function;

public class Lesson1 {
    static class Test{
void show(){
    System.out.println();
}
    }
    public static void main(String[] args) {
        Test obj1 = new Test() {
            @Override
            public void show() {
                System.out.println("This is object correction");
            }
        };
        obj1.show();
        Test   obj2 =new Test() {
            @Override
            void show() {
                System.out.println("This is lambda function 1");
            }
        };obj2.show();
    }
}
