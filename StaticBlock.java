/*
    Usa um bloco estático
*/
public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // Esse bloco é executado quando a classe é carregada
    static{
        System.out.println("Dentro do bloco static.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg){
        System.out.println(msg);
    }
}