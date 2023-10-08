package Module_2.Chapter11MatchJavaIdentifier;

public class Lesson3Regex {
    public static void main(String[] args) {
        String patten = "[wb](ad || eed)";
        String myinp = "web";
        System.out.println(myinp.matches(patten));
    }
}
