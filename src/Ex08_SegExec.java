import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex08_SegExec {
    /**
     * Recrie o programa do exercicio 6 e o coloque dentro de um bloco try-catch. Coloque um catch para o NullPointerException e um catch para uma Exception Genérica.
     */
    public static void main(String[] args) {
        try{
            String loop;
            Collection<String> resultadoColection = new ArrayList<String>();
            do {
                String name;
                Scanner in = new Scanner(System.in);
                Scanner in2 = new Scanner(System.in);
                System.out.println("Adicione um nome");
                name = in.nextLine();
                resultadoColection.add(name);
                System.out.println(resultadoColection);
                System.out.println("Digite fim para finalizar");
                loop = in2.nextLine();
            } while (!loop.equals("fim"));

            PriorityQueue<String> listaOrdenada = new PriorityQueue<>(resultadoColection);

            listaOrdenada.forEach(System.out::println);

            System.out.println(listaOrdenada);

        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Mensagem de Erro: " + e.getMessage());
        }
    }
}
