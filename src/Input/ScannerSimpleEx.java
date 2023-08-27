package Input;

import java.util.Scanner;

public class ScannerSimpleEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Te rog introdu de la tastatura un text ");
        String thing = scan.nextLine();
        System.out.println(thing.toUpperCase());

        System.out.println("Te rog sa introduci un numar intreg ");
        int number = scan.nextInt();
        System.out.print(number);

        System.out.println("Te rog introdu un numar cu virgula ");
        double dnumbers =scan.nextDouble();
        System.out.printf("%.2f",dnumbers);// %.2f - doua zecimale dupa virgula(inlocuiesti doar numarul)

    }
}
