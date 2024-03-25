import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        String extenso;
        switch (numero) {
            case 1:
                extenso = "um";
                break;
            case 2:
                extenso = "dois";
                break;
            case 3:
                extenso = "três";
                break;
            case 4:
                extenso = "quatro";
                break;
            case 5:
                extenso = "cinco";
                break;
            default:
                extenso = "Número inválido!";
        }

        System.out.println(extenso);

        scanner.close();
    }
}
