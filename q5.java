//Q5 - Find the total number of bits needed to be flipped to convert x to y.

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for x: ");
        int x = sc.nextInt();
        System.out.print("Enter value for y: ");
        int y = sc.nextInt();

        int n = x ^ y;
        int count = 0;
        while (n != 0){
        n = n & (n - 1);
        count++;
        }

        System.out.println("Number of bits needed to be flipped to convert x to y: " + count);
    }
}
