/*
    Usa varargs com argumentos comuns
*/
public class VarArgs2 {
    // Aqui, msg é um parâmetro varargs
    // e v é um parâmetro varargs
    
    static void vaTest(String msg, int ...v){
        System.out.println(msg + v.length);
        System.out.println("Conteudo: ");

        for (int i = 0; i < v.length; i++){
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        vaTest("Um varargs: ", 10);
        vaTest("Três varargs: ", 1, 2, 3);
        vaTest("Sem varargs: ");
    }
}