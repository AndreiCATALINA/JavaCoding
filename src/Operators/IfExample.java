package Operators;

public class IfExample {
    public static void main(String[] args) {

        float temperature = 35.5f;

        boolean hasFever = temperature >= 36.6f;

        if (hasFever) {
            System.out.println("You have fever!");

            System.out.println("Final");
        }
    }
}
