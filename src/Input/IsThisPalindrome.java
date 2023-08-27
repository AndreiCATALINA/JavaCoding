package Input;

import java.util.Scanner;

public class IsThisPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        StringBuilder builder =new StringBuilder(input);
        String inputRevers = builder.reverse().toString();
        boolean isPalindrome = input.equals(inputRevers);
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

//    public static boolean isPalindrome(String str) {
//
//        return str.equals(new StringBuilder(str).reverse().toString());
//    }
}
