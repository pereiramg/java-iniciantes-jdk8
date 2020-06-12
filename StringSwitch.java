/*
    Usa um string para controlar uma instrução switch
*/
public class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnect":
                System.out.println("Disconnectiong");
                break;
            default:
                System.out.println("Command error!");
                break;
        }
    }

}