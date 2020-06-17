/*
    Varargs e a sobrecarga
*/
public class VarArgs3 {

    // primeira versão do vaTest()
    static void vaTest(int... v) {
        System.out.println("vaTest(int ...): " + "Numero de args: " + v.length);
        System.out.println("Conteudo: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();

    }

    // segunda versão do vaTest()
    static void vaTest(Boolean... v) {
        System.out.println("vaTest(boolean ...): " + "Numero de args: " + v.length);
        System.out.println("Conteudo: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();

    }

    // Terceira versão do vaTest()
    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Conteudo: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Testando: ", 10, 20);
        vaTest(true, false, false);
    }

}