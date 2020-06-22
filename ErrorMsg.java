/*
    Retorna um objeto String
*/
public class ErrorMsg {

    // código de erro
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    
    String msgs[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };

    // Retorna a mensagem de erro
    String getErrorMsg(int i){
        if (i >= 0 & i < msgs.length){
            return msgs[i];
        }else{
            return "Invalid Error Code";
        }
    }

}