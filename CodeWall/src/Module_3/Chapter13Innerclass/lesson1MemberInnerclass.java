package Module_3.Chapter13Innerclass;

public class lesson1MemberInnerclass {
    private int a = 20;
    void sum(){}
    class inner{
        void show(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        lesson1MemberInnerclass obj = new lesson1MemberInnerclass();
        inner inObject = obj.new inner();
        inObject.show();
    }
}
