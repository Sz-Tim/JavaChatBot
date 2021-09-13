import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String inInterval = "False";

        if (value > -15 && value <= 12) {
            inInterval = "True";
        } else if (value > 14 && value < 17) {
            inInterval = "True";
        } else if (value >= 19) {
            inInterval = "True";
        }

        System.out.print(inInterval);
    }
}