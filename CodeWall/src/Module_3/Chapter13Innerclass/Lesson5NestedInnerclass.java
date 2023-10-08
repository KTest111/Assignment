package Module_3.Chapter13Innerclass;

public class Lesson5NestedInnerclass {
    public static void main(String[] args) {
        OuterInf.InnerInf obj = new OuterInf.InnerInf() {
            @Override
            public void show() {
                System.out.println("Nested Inf");

            }
        };obj.show();
    }
}
    interface OuterInf {

        interface InnerInf {
            void show();
        }
    }

