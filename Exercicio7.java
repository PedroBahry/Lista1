import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }

        scanner.close();
    }
}
