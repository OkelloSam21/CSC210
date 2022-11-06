//import java.lang.reflect.Constructor;

public class NegativeNumberException extends Exception {

    public NegativeNumberException(){
        super("NegativeNumber!!");
    }
    
    public NegativeNumberException(String message){
        super(message);
    }

}
