package vs.exception_handler_starter.exception;

import org.springframework.http.HttpStatus;

public interface EnumInterface {

    String getErrorMessage();

    String getException();

    HttpStatus getHttpStatus();

}
