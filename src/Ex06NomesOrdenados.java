import java.util.*;

public class Ex06NomesOrdenados {

    public static void main(String[] args) {

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

    }
}
