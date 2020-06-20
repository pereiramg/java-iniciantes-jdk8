public class Shapes {
    
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        // todos os membros de Triangle estão disponiveis para objetos
        // Triangle, mesmo os herdados de TwoDShape
        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "outlined";

        System.out.println("Informações para t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area é " + t1.area());

        System.out.println();

        System.out.println("Informações para t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area é " + t2.area());

    }
}