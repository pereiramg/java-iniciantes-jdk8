public class StaticBlockDemo {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Dentro do Constructor");

        System.out.println("Raiz quadrada de 2 é: " + StaticBlock.rootOf2);
        System.out.println("Raiz quadrada de 3 é: " + StaticBlock.rootOf3);
    }
}