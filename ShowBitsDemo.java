/*
    Demostra Showbits
*/
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 em binario: ");
        b.show(123);

        System.out.println("\n87987 em binario: ");
        i.show(87987);

        System.out.println("\n237658768 em binario: ");
        li.show(237658768);

        // você também pode exibir os bits de ordem inferior de qualquer inteiro
        System.out.println("\nValor abaixo de 8 bits de 87987 em binario: ");
        b.show(87987);
    }
}