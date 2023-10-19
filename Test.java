/*Shane Tinsley - CSD 320 - Module 1 Assignment
Calculates the results of two problems. One is a decimal result the other is a 
whole number.
Result 1 (Using Floating-Point Numbers):
Result 1 uses double-precision floating-point numbers (e.g., 1.0, 1.0 / 3.0, etc.).
In this case, the divisions are performed with decimals, and the result retains 
fractional values.
Result 2 (Using Integers):
Result 2 uses integer values (e.g., 1, 1 / 3, etc.).
In this case, the divisions are performed as integer divisions, which truncate 
decimal parts and result in integer quotients.
My instinct was to use float and int variable types, but after learning about 
the double type on W3Schools I decided that this was the best way to proceed.
I am already seeing the advantages and a appeal of Python because it allocates
resources automatically whereas Java you have to think in bytes*/

public class Test {
    public static void main(String[] args) {
        double result1 = 4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);
        double result2 = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

    }
}
