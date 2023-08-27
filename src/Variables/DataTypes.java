package Variables;

import java.sql.SQLOutput;

public class DataTypes {
    //psvm - comanda rapida
    public static void main(String[] args) {
        //byte (8 bits) [-128,127]
     byte byteNumber = 127;

     short shortNumber = (short)(byteNumber + 1); // cast de la byte la short

     int intNumber= 50;

     long longNumber= Integer.MAX_VALUE +1;

     int anotherIntNumber = (int)(156L + intNumber);

//mereu ramane tipul mai mare ca rezultat de operatie(exemplu: int + long = long)
        //orice numar e int la inceput


        byte byteNumberTwo = (byte)(shortNumber + 10);
        System.out.println(byteNumberTwo);

        //la finalul numarului punem F sau f
        float floatNumber = 12.25f;
        //la finalul numarului punem D sau d - default
        double doubleNumber= 12.25D;

        float anotherFloatNumber= (float)(50.5 + floatNumber);


        boolean value = false;
        boolean anotherValue = value || true;

        System.out.println(anotherValue);

        char firstCharacter = 'm';
        char newLine = '\n';

        System.out.print(newLine);
        System.out.println((firstCharacter));




    }
}
