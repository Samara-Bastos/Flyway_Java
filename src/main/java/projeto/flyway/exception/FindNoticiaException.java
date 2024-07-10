package projeto.flyway.exception;

public class FindNoticiaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FindNoticiaException(String ex){
        super(ex);
    }
}
