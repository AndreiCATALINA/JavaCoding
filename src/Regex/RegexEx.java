package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args) {

        Pattern pattern1 = Pattern.compile("alo+");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Te rog introdu textul: ");

        Matcher matcher = pattern1.matcher(scanner.nextLine());
        System.out.println(matcher.matches());


        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]*");
        System.out.println("Introdu ceva");
        Matcher matcher2 = pattern2.matcher(scanner.nextLine());
        System.out.println(matcher2.find());
        scanner.close();
    }
}
