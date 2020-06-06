/*
    Variaveis de caracteres podem ser tratados como inteiros
*/
public class CharArithDemo {
    public static void main(String[] args) {
        
        // definição de variavel
        char ch;

        ch = 'X';
        System.out.println("ch contem " + ch);

        // um char pode ser incrementado
        ch++;
        System.out.println("ch agora é " + ch);

        // char pode receber um valor inteiro
        // dá ao ch o valor de Z
        ch = 90;
        System.out.println("ch agora é " + ch);
    }    
}