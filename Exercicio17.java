import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        int peso1 = scanner.nextInt();
        int peso2 = scanner.nextInt();
        int peso3 = scanner.nextInt();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("Media ponderada: " + media);

        scanner.close();
    }
}
