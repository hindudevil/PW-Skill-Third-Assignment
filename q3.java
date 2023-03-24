//Q3 - Write a program to calculate the sum of the digits of a 3-digit number.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;
        
        int sum = digit1 + digit2 + digit3;
        
        System.out.println("Sum of digits: " + sum);
    }
}
