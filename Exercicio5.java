import java.util.Scanner;

public class Exercicio5 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma variável A: ");
        String A = scanner.next();

        System.out.print("Digite uma variável B: ");
        String B = scanner.next();

        System.out.println("-------------------------------");

        System.out.println("O valor invertido de A é: " + B);
        System.out.println("O valor invertido de B é: " + A + "\n");

        System.out.println("O valor original de A era: " + A);
        System.out.println("O valor original de B era: " + B);

        System.out.println("-------------------------------");

        scanner.close();

    }
}