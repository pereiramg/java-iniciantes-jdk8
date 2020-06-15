public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Fatotial usando o metodo recursivo.");
        System.out.println("Fatorial de 3 é " + f.factR(3));
        System.out.println("Fatorial de 4 é " + f.factR(4));
        System.out.println("Fatorial de 5 é " + f.factR(5));
        System.out.println();
        System.out.println("Fatotial usando o metodo iterativo.");
        System.out.println("Fatorial de 3 é " + f.factI(3));
        System.out.println("Fatorial de 4 é " + f.factI(4));
        System.out.println("Fatorial de 5 é " + f.factI(5));

    }
}