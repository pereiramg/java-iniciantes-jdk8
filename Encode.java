/*
    Usa XOR para codificar e decodificar uma mensagem
*/
public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Mensagem original: ");
        System.out.println(msg);

        // codifica a mensagem
        j = 0;
        for (int i = 0; i < msg.length(); i++){
                                    // essa parte constroi o string codificado
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j=0;
        }
        System.out.print("Mensagem codificada: ");
        System.out.println(encmsg);

        // decodifica a mensagem
        j = 0;
        for (int i = 0; i < msg.length(); i++){
                                        // decodifica a string
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j=0;
        }
        System.out.print("Mensagem decodificada: ");
        System.out.println(decmsg);
    }
    
}