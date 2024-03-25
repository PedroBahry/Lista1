import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double consumo = distancia / 12;

        System.out.println("Consumo: " + consumo + " litros");

        scanner.close();
    }
}
