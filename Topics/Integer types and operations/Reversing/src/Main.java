import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int inputDigit1 = inputNumber / 100;
        int inputDigit2 = (inputNumber % 100) / 10;
        int inputDigit3 = inputNumber % 10;
        int outputNumber = inputDigit3 * 100 + inputDigit2 * 10 + inputDigit1;

        System.out.println(outputNumber);

    }
}