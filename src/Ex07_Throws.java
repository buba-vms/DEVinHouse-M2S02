public class Ex07_Throws {
    /**
     *
     * Crie um programa que gera um exception sempre que executado, pegue essa exception em um Catch e print a mensagem de erro.
     */
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = a/a;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }


    };
}
