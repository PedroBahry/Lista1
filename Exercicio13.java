import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Divisão por zero!");
                } else {
                    resultado = a / b;
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }

        if (operador == '+' || operador == '-' || operador == '*' || (operador == '/' && b != 0)) {
            System.out.println(resultado);
        }

        scanner.close();
    }
}
