package vs.exception_handler_starter.exception;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

    String uri;

    String type;

    String message;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:SSS")
    LocalDateTime timestamp;


}
