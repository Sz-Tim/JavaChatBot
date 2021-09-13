import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String triangle = "NO";

        if (a + b > c && a + c > b && b + c > a) {
            triangle = "YES";
        }

        System.out.println(triangle);
    }
}