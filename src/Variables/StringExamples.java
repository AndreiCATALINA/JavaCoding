package Variables;

public class StringExamples {

    public static void main(String[] args) {

        String text = "this is a text";

        System.out.println(text);

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println("The text length is "+text.length());
        System.out.println(text.concat(" alt text").concat(" inca un text"));

        System.out.println(text.indexOf("text")); // indexOf - pe ce pozitie se afla

        String anotherText = "This is a text";

        System.out.println(text.equals(anotherText));
        System.out.println(text.equalsIgnoreCase(anotherText));

        System.out.println(anotherText.replaceAll(" ",","));

        System.out.println(anotherText.contains("is"));



    }
}
