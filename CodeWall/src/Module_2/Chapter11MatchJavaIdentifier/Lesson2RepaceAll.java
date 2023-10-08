package Module_2.Chapter11MatchJavaIdentifier;

public class Lesson2RepaceAll {
    public static void main(String[] args) {
        String paragraph = "Java is an OOP language used in multiplaform";

        paragraph = paragraph.replaceAll("OOP", "object oriented programming");
        System.out.println(paragraph);

        paragraph = "it is attempt, framwork is temporary and language is not 1temp.";
        System.out.println(paragraph.replaceAll("\\dtemp\\b","Temporary"));
    }
}
