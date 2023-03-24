/*Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
i) both the conditions 'a < 50' and 'a < b' are true.
ii) at least one of the conditions 'a < 50' or 'a < b' is true. */

public class q4 {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Check if both a < 50 and a < b are true using logical AND operator
        System.out.println(a < 50 && a < b );

        // Check if at least one of a < 50 or a < b is true using logical OR operator
        System.out.println(a < 50 || a < b );
    }
}
