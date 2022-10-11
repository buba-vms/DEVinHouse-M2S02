import java.util.Scanner;

public class Ex01Soma {
    /**
     * Crie um programa que receba 2 dados escritos pelo usuário
     * e realize uma soma entre esses número e
     * exiba o resultado no terminal.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Soma Entre dois Números");
        System.out.print("Digite o primeiro número: ");
        double num1 = in.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = in.nextDouble();
        System.out.println("A Soma entre os dois números é: " + (num2 + num1));
    }
}
