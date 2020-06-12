/*
    Usa XOR para codificar e decodificar uma mensagem
*/
public class Encode {
    public static void main(String[] args) {
        String msg = "Isto é um teste";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Mensagem original: ");
        System.out.println(msg);

        // codifica a mensagem
        for (int i = 0; i < msg.length(); i++){
                                    // essa parte constroi o string codificado
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.print("Mensagem codificada: ");
        System.out.println(encmsg);

        // decodifica a mensagem
        for (int i = 0; i < msg.length(); i++){
                                        // decodifica a string
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.print("Mensagem decodificada: ");
        System.out.println(decmsg);
    }
    
}