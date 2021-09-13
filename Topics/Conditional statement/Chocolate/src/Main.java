import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        String breakable = "NO";

        if ((k % n == 0 && k / n < m) || (k % m == 0 && k / m < n)) {
            breakable = "YES";
        }

        System.out.print(breakable);
    }
}