import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
