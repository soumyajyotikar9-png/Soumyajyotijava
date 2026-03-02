public class FactorialCalculator {

    public long calculateFactorial(int number) {

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        final int Number = 5;

        FactorialCalculator Calculator = new FactorialCalculator();

        long result = Calculator.calculateFactorial(Number);

        System.out.println("Factorial of " + Number + " is: " + result);
    }
}
