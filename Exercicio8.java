import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero >= 50) {
            System.out.println("O número é maior ou igual a 50.");
        } else {
            System.out.println("O número é menor que 50.");
        }

        scanner.close();
    }
}
