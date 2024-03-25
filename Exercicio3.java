import java.util.Scanner;

public class Exercicio3 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número inteiro: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo!");
        } else if (num1 == num2) {
            System.out.println("O primeiro número é igual ao segundo número!");
        } else {
            System.out.println("O primeiro número é menor que o segundo número!");
        }

        scanner.close();

    }
}