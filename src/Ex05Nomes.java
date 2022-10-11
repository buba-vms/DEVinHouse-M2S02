import java.util.Scanner;

public class Ex05Nomes {
    /**
     * Crie um Loop que irá receber 10 nomes e após isso irá exibir os nomes e a posição deles na lista. Utiliz um array(vertor) para esses exercício.
     *
     */
    public static void main(String[] args) {
        String[] listaNomes = new String[10];
        for (int i = 0; i < listaNomes.length; i ++){
            Scanner in = new Scanner(System.in);
            System.out.print("Digite o " + (i + 1) + "ª Nome: ");
            listaNomes[i] = in.nextLine();
        }
        for (int i = 0; i < listaNomes.length; i ++){
            System.out.println("Nome: " + listaNomes[i] + " Posição: " + i);
        }
    };
}
