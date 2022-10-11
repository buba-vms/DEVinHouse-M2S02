import java.util.Objects;
import java.util.Scanner;

public class Ex03Calc02 {
    /**
     *
     * Adicione um loop á calculadora do Exercício 02, onde ela deve realizar operações até receber a palavra "fim" na opção de operação.
     */
    public static void main(String[] args) {


        String loop = null;
        Scanner in2 = new Scanner(System.in);
        do {
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
            System.out.println("Digite fim para finalizar");
            loop = in2.nextLine();
        } while (!loop.equals("fim"));
    }
}
