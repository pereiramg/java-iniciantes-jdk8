
public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // Cada objeto tem sua própria cópia de uma variável de instância
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Claro que, ob1.x e ob2.x são independentes");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        // Cada objeto compartilha uma copia de uma variável estática
        System.out.println("A variavel static y é compartilhada");
        StaticDemo.y = 19;
        System.out.println("Ajustando StaticDemo.y para 19");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Alterando o StaticDemo.y para 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }

}