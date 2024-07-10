package projeto.flyway.exception;

public class NotFoundNoticiaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotFoundNoticiaException(String ex){
        super(ex);
    }
}
