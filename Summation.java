/*
    Inicializa um objeto com outro
*/
public class Summation {
    int sum;

    // constroi a partir de um int
    Summation(int num){
        sum = 0;
        for (int i = 1; i <= num; i++){
            sum += 1;
        }
    }

    // constroi a partir de outro objeto
    Summation(Summation ob){
        sum = ob.sum;
    }
}