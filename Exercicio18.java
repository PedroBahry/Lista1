import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        System.out.println("Media harmonica: " + media);

        scanner.close();
    }
}
