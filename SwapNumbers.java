public class SwapNumbers {

    public static void main(String[] args) {

        NumberWrapper num1 = new NumberWrapper(10);
        NumberWrapper num2 = new NumberWrapper(20);

        System.out.println("Before swapping:");
        System.out.println("num1 value: " + num1.getNumber());
        System.out.println("num2 value: " + num2.getNumber());

        num1.swapValues(num2);

        System.out.println("\nAfter swapping:");
        System.out.println("num1 value: " + num1.getNumber());
        System.out.println("num2 value: " + num1.getNumber());
    }
}

class NumberWrapper {

    private int number;

    public NumberWrapper(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void swapValues(NumberWrapper other) {
        int temp = this.number;
        this.number = other.number;
        other.number = temp;
    }
}
