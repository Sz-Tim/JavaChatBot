import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int netDayTravel = a - b;
        int days = (h + netDayTravel - b - 1) / netDayTravel;

        System.out.println(days);

    }
}