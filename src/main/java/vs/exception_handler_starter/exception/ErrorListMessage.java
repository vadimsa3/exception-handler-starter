package vs.exception_handler_starter.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ErrorListMessage {

    String uri;

    String type;

    List<String> messages;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:SSS")
    LocalDateTime timestamp;


}
