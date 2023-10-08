package Module_3;

public class Lesson3StaticNestedclass {
    private static int a = 5;
    static class Inner{
        void work(){
            System.out.println("work" + a);
        }
    }
    public static void main(String[] args) {
      Inner obj = new Inner();
        obj.work();
    }
}
