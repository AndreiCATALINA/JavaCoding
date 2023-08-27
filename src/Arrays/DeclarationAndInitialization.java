package Arrays;

public class DeclarationAndInitialization {
    public static void main(String[] args) {

        String[] myStringArray = new String[5];//declararea unui array cu elemente de tip string cu lungimea de 5 elemente
        myStringArray[0] = "SDA";//adaug ceva pe pozitia aleasa(0) sau o citim daca nu avem =
        myStringArray[4] = "Curs";
        myStringArray[1] = "Andrei";
        System.out.println(myStringArray[1].length());

        String[] mySecondString = new String[]{"SDA", "Andrei", "Radu", "Ion"};
        System.out.println(mySecondString[2]);
        int[] intArr = {2, 3, 4, 5, 1};// merge si asa (fara new int[]) daca bagi elemente in el

        if (myStringArray[1] != null) {
            System.out.println(myStringArray[1].toUpperCase());
        }
        System.out.println(intArr.length);
    }
}
