package exception;

public class BusinessException extends RuntimeException {
    //Essa é a estrutura pra criar sua exceção personalizada
    public BusinessException(String msg){
        super(msg);
    }
}
