import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (a > b) {
                System.out.println("O número A é maior que B.");
            } else {
                System.out.println("O número B é maior que A.");
            }
        }

        scanner.close();
    }
}
