package Games;

import java.util.Scanner;

public class CesarEncriptedMesage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter what you want to code : ");
        String codeMessage = scan.nextLine();
        coded(codeMessage);

        System.out.print("Enter what you want to decode: ");
        String encodedMessage = scan.nextLine();
        decode(encodedMessage);

        scan.close();
    }

    public static void decode(String encodedMessage) {
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};
        char[] encodedChars = encodedMessage.toCharArray();

        for (int i = 0; i < encodedChars.length; i++) {
            if (encodedChars[i] == ' ' || encodedChars[i] == '.' || encodedChars[i] == ',' || encodedChars[i] == '!' || encodedChars[i] == '?') {
                continue;
            } else {
                for (int j = 0; j < alfabet.length; j++) {
                    if (j >= 20 && encodedChars[i] == alfabet[j]) {
                        encodedChars[i] = alfabet[j - 20];
                        break;
                    } else if (encodedChars[i] == alfabet[j]) {
                        encodedChars[i] = alfabet[j + 5];
                        break;
                    }
                }
            }
        }
        System.out.println(new String(encodedChars));
    }

    public static void coded(String codeMessage) {
        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};
        char[] codedChars = codeMessage.toCharArray();


        for (int i = 0; i < codedChars.length; i++) {
            if (codedChars[i] == ' ' || codedChars[i] == '.' || codedChars[i] == '.' || codedChars[i] == '!' || codedChars[i] == '?') {
                continue;
            }
            for (int j = 0; j < alfabet.length; j++) {
                if (j <= 4 && codedChars[i] == alfabet[j]) {
                    codedChars[i] = alfabet[j + 20];
                    break;
                } else if (codedChars[i] == alfabet[j]) {
                    codedChars[i] = alfabet[j - 5];
                    break;
                }
            }
        }
        System.out.println(new String(codedChars));// + " \uD83D\uDC7D" - emoji alien
    }

}