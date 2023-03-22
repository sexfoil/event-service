import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Event {
    @JsonIgnore
    private long id;

    private String title;

    private String place;

    private String speaker;

    private EventType eventType;

    private LocalDateTime dateTime;

}
