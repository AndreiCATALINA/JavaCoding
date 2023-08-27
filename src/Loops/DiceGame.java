package Loops;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        int dice1;
        int dice2;
        int count=0;
        int dice3;
        do {
             dice1 = randomNumber.nextInt(1, 7);
             dice2 = randomNumber.nextInt(1, 7);
             dice3 = randomNumber.nextInt(1, 7);
             ++count;
            System.out.println("Primul zar este " + dice1 + "val doilea zar este " + dice2+" si al treilea este "+ dice3);

        } while(!(dice1 == dice2 && dice2 ==dice3));

        System.out.println("Ai aruncat zarul de "+count+" ori.");

    }
}
