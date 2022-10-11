import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Ex04Calc03 {
    /**
     *
     * Após receber a palavra "fim" o program deve exibir os resultados de cada uma das contas realizadas até o presente momento. Utilize um array ou Array List para realizar essa tarefa.
     */
    public static void main(String[] args) {


        String loop;
        Scanner in2 = new Scanner(System.in);
        Collection<Double> resultadoColection = new ArrayList<Double>();
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
            double resultado;


            switch (operador) {
                case "soma" -> {
                    resultado = num1 + num2;
                    resultadoColection.add(resultado);
                    System.out.println(resultado);
                }
                case "subtracao" -> {
                    resultado = num1 - num2;
                    resultadoColection.add(resultado);
                    System.out.println(resultado);
                }
                case "multiplicacao" -> {
                    resultado = num1 * num2;
                    resultadoColection.add(resultado);
                    System.out.println(resultado);
                }
                case "divisao" -> {
                    resultado = num1 / num2;
                    resultadoColection.add(resultado);
                    System.out.println(resultado);
                }
                default -> System.out.println("valor invalido");
            }
            System.out.println("Digite fim para finalizar");
            loop = in2.nextLine();
        } while (!loop.equals("fim"));
        System.out.println(resultadoColection);
        for (double resultado:resultadoColection
             ) {
            System.out.println(resultado);
        }
    }
}
