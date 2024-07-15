package projeto.flyway.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(NotFoundNoticiaException.class)
    public ResponseEntity<String> handleErrorNotFoundNoticiaException(NotFoundNoticiaException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(FindNoticiaException.class)
    public ResponseEntity<String> handleErrorFindNoticiaException(FindNoticiaException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
