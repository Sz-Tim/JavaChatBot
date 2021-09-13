import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nPositive = 0;
        while (scanner.hasNext()) {
            if (scanner.nextInt() > 0) {
                nPositive++;
            }
        }

        System.out.print(nPositive == 1);
    }
}