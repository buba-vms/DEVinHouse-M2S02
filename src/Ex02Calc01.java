import java.util.Objects;
import java.util.Scanner;

public class Ex02Calc01 {
    /**
     * Crie uma calculadora que irá receber 2 números e um operador(soma, subtracao, multiplicacao ou divisao) e esse programa deve retornar o valor da operação realizada

     */
    public static void main(String[] args) {

        System.out.println("Calculadora");
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = in.nextDouble();

        System.out.println("Digite uma das seguintes operações:");
        System.out.println("soma, subtracao, multiplicacao, divisao");

        Scanner scanner = new Scanner(System.in);
        String operador = scanner.nextLine();

        switch (operador) {
            case "soma" -> System.out.println(num1 + num2);
            case "subtracao" -> System.out.println(num1 - num2);
            case "multiplicacao" -> System.out.println(num1 * num2);
            case "divisao" -> System.out.println(num1 / num2);
            default -> System.out.println("valor invalido");
        }

    }
}
