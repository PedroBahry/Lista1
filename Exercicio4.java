import java.util.Scanner;

public class Exercicio4 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double multi = num1 * num2;
        double soma = num1 + num2;
        double sub = num1 - num2;
        double div = num1 / num2;

        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + sub);
        System.out.println("A divisão é " + div);
        System.out.println("A multiplicação é " + multi);

        scanner.close();

    }
}