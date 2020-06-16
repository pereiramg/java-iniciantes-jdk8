/*
    Usa uma variavel estática
*/
public class StaticDemo {
    int x; // uma variavel de instancia comum
    // Aqui há uma cópia de y para todos os objetos compartilharem
    static int y; // uma variavel estática

    // Retorna a soma da variavel de instancia x
    // e a variável estática y
    int sum(){
        return x + y;
    }
}