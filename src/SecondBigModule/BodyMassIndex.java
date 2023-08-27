package SecondBigModule;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your weigth in KG: ");

        double weigth = scanner.nextDouble();

        System.out.println("Please enter your heigth in M: ");

        double heigth = scanner.nextDouble();

        double bmi = weigth / (heigth * heigth);

        System.out.println("Your BMI mass is: " + bmi);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is optimal.");
        } else {
            System.out.println("Your BMI is not optimal.");
        }

    }


}
