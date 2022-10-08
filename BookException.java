public class BookException extends Exception {

    public BookException (String message){
        super(message);
    }

    public String notNumber(){
        return "Your input is not a number!";
    }
}
