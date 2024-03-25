import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println(an);

        scanner.close();
    }
}
