import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        System.out.print(string.toUpperCase().charAt(0) == 'J');
    }
}