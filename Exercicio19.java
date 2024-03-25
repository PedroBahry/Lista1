import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Volume: " + volume);

        scanner.close();
    }
}
