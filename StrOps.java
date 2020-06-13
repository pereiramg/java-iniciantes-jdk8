/*
    Algumas operações com Strings
*/
public class StrOps {
    public static void main(String[] args) {
        String str1 = "Quando ele entra para Web programming, Java é #1.";
        String str2 = new String(str1);
        String str3 = "Java string é poderoso";
        int resultado, idx;
        // char ch;

        System.out.println("O tamanho de str1: " + str1.length());

        // Exibe um caractere de cada vez de str1
        for (int i = 0; i < str1.length(); i++){
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        if (str1.equals(str2)){
            System.out.println("str1 é igual a str2");
        }else{
            System.out.println("str1 não é igual a str2");
        }

        if (str1.equals(str3)){
            System.out.println("str1 é igual a str3");
        }else{
            System.out.println("str1 não é igual a str2");
        }

        resultado = str1.compareTo(str3);
        if (resultado == 0){
            System.out.println("str1 é igual a str3");
        }else if (resultado < 0){
            System.out.println("str1 é menor que str3");
        }else{
            System.out.println("str1 é maior que str3");
        }

        // atribui um novo string a str2
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("O index da primeira ocorrencia: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("O index da ultima ocorrencia: " + idx);
    }
    
}