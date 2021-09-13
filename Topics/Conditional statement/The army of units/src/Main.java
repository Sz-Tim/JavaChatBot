import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nUnits = scanner.nextInt();
        String category = "";

        if (nUnits < 1) {
            category = "no army";
        } else if (nUnits <= 19) {
            category = "pack";
        } else if (nUnits <= 249) {
            category = "throng";
        } else if (nUnits <= 999) {
            category = "zounds";
        } else {
            category = "legion";
        }

        System.out.print(category);
    }
}