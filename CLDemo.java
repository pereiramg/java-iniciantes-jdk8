/*
    Exibe todas as informações de linah de comando
*/
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Lá tem " + args.length 
        + " argumentos de linha de comando");

        System.out.println("Eles estão ");
        for (int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
    
}