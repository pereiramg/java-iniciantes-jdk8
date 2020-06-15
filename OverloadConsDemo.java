/*
    Chamada de um costrutor sobrecarregado
*/

public class OverloadConsDemo {
    public static void main(String[] args) {
        OverloadCons t1 = new OverloadCons();
        OverloadCons t2 = new OverloadCons(88);
        OverloadCons t3 = new OverloadCons(17.23);
        OverloadCons t4 = new OverloadCons(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}