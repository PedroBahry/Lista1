import java.util.Scanner;

public class Exercicio2 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;

        System.out.println("O resultado da soma é " + resultado + "!");

        scanner.close();

    }
}