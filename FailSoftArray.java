/*
    Esta classe implementa um array resistente a falhas
*/
public class FailSoftArray {
    private int a[]; // referencia ao array
    private int errval; // valor a ser retornado se get() falhar
    public int lenght; // lenght é pública

    //  constroi o array dados seu tamanho e o valor
    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        lenght = size;
    }

    // retorna o valor do indice especificado
    public int get(int index){
        if (indexOK(index)){
            return a[index];
        }
        return errval;
    }

    // insere um valor em um indice. Retorna false em caso de falha
    public boolean put(int index, int val){
        if (indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    // retorna true se indez estiver dentro dos limites
    private boolean indexOK(int index){
        if (index >=0 & index < lenght){
            return true;
        }
        return false;
    }
}