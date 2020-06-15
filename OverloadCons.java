/*
    Demostra um construtor sobrecarregado
*/
public class OverloadCons {
    int x;

    OverloadCons(){
        System.out.println("Dentro OverloadCons()");
        x = 0;
    }

    OverloadCons(int i){
        System.out.println("Dentro OverloadCons(int)");
        x = i;
    }

    OverloadCons(double d){
        System.out.println("Dentro OverloadCons(double)");
        x = (int) d;
    }

    OverloadCons(int i, int j){
        System.out.println("Dentro OverloadCons(int, int)");
        x = i * j;
    }
}