/*
    Sistema de ajuda em instruções Java que 
    processa várias solicitações terminado
*/
public class Help3 {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;

        for (;;) {
            do {
                System.out.println("Ajuda");
                System.out.println(" 1 - if");
                System.out.println(" 2 - switch");
                System.out.println(" 3 - for");
                System.out.println(" 4 - while");
                System.out.println(" 5 - do-while");
                System.out.println(" 6 - break");
                System.out.println(" 7 - continue\n");
                System.out.println("clique em q para sair: ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q')
                break;

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("O if:\n");
                    System.out.println("if (condição) instruções;");
                    System.out.println("else instruções;");
                    break;
                case '2':
                    System.out.println("O switch:\n");
                    System.out.println("switch (expressao) {");
                    System.out.println("   case  constante:");
                    System.out.println("      instrucoes sequenciais;");
                    System.out.println("      break;");
                    System.out.println("   // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("O for:\n");
                    System.out.println("for (incialização;condição;iteração)");
                    System.out.println("instrucoes;");
                    break;
                case '4':
                    System.out.println("O while:\n");
                    System.out.println("while (condição) instrucoes");
                    break;
                case '5':
                    System.out.println("O do-while:\n");
                    System.out.println("do {");
                    System.out.println("instrucoes;");
                    System.out.println("while (condição);");
                    break;
                case '6':
                    System.out.println("O break:\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("O continue:\n");
                    System.out.println("continue; or continue label;");
                    break;
            }
            System.out.println();
        }
    }
}