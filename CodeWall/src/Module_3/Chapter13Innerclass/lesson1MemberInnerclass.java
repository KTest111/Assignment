package Module_3;

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
        System.out.println(obj.a);

        inner inObject = obj.new inner();
        inObject.show();
    }
}
