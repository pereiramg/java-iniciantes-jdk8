/*
    Demostra Switch
*/

public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i é zero");
                    break;
                case 1:
                    System.out.println("i é um");
                    break;
                case 2:
                    System.out.println("i é dois");
                    break;
                default:
                    System.out.println("i é 3 ou mais");
            }

    }
}