public class mathTest{
    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts one integer from another
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides one integer by another
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Computes the square of an integer
    public int square(int a) {
        return a * a;
    }
}
