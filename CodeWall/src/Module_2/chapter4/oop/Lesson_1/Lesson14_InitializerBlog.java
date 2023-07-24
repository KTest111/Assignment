package Module_2;

public class Lesson14_InitializerBlog {
    Lesson14_InitializerBlog(){
        System.out.println("I'm Constructor");
    }
    {
        System.out.println("I'm Initializater blog");
    }
    {
        System.out.println("I'm Constructor");
    }

    public static void main(String[] args) {
        Lesson14_InitializerBlog obj = new Lesson14_InitializerBlog();
    }
}
