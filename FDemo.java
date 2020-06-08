/*
    Coleta de lixo
*/
public class FDemo {
    int x;

    FDemo(int i){
        x = i;
    }
    
    // chamada quando o objeto é reciclado
    protected void finalize(){
        System.out.println("Finalizando " + x);
    }

    // Gera diversos objetos
    void generator (int i){
        FDemo o = new FDemo(i);
    }
}