package DAL;

/**
 *
 * @author Lenovo
 */
public class CrudFormException extends Exception{
    public CrudFormException(){
    
    }
    
    public CrudFormException(String ex){
        super(ex);
    }
}