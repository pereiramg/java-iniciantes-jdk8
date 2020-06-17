/*
    Demostra argumentos em quantidade variável
*/
public class VarArgs {
    // vaTest() usa um vararg.
    static void vaTest(int ...v ){
        System.out.println("Numero de args: " + v.length);
        System.out.println("Conteudo: ");

        for (int i = 0; i < v.length; i++){
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Observe como vaTest() pode ser chamado
        // com um número de argumentos variável
        vaTest(10); // 1 argumento
        vaTest(1, 2, 3); //3 argumentos
        vaTest(); // nenhum argumento
    }
}