/*
    Tipos primitivos são passados por valor
*/
public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a e b antes da chamada: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a e b depois da chamada: " + a + " " + b);
    }
}