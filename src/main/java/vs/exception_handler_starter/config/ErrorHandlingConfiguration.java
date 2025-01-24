package vs.exception_handler_starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vs.exception_handler_starter.handler.GlobalExceptionHandler;
import vs.exception_handler_starter.exception.AppException;
import vs.exception_handler_starter.exception.ErrorMessage;

@Configuration
public class ErrorHandlingConfiguration {

    @Bean
    public AppException appException() {
        return new AppException();
    }

    @Bean
    public ErrorMessage errorMessage() {
        return new ErrorMessage();
    }

    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }


}
