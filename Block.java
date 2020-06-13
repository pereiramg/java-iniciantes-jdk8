/*
    Objetos podem ser passados para os metodos
*/
public class Block {
    int a, b, c, volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Retorna true se ob definir o mesmo bloco
    boolean sameBlock(Block ob){
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)){
            return true;
        }else{
            return false;
        }
    }
    
    // retorna true se ob tiver o mesmo volume
    boolean sameVolume(Block ob){
        if (ob.volume == volume){
            return true;
        }else{
            return false;
        }
    }

}