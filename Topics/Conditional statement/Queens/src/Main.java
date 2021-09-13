import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        String hit = "NO";

        if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            hit = "YES";
        }

        System.out.print(hit);
    }
}