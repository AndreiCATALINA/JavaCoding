package Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int number2 = 5;
        int number1 = 7;

        System.out.println(number1 == number2);
        System.out.println(number1 != number2);

        boolean firstValue = true;
        boolean secondValue = false;

        System.out.println(firstValue == secondValue);
        System.out.println(firstValue != secondValue);


        System.out.println("Ceck is number1 is greater than number2: "+(number1>number2));
        System.out.println("Ceck is number1 is smaller than number2: "+(number1<number2));
        System.out.println("Ceck is number1 is greater or equal number2: "+(number1>=number2));

        boolean resultValue = (6>number2) && (6<number1);
        System.out.println(resultValue);

    }
}
