import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event-service")
public interface EventService<E> {

    void createEvent(E e);

    void updateEvent(E e);

    E getEvent(long id);

    void deleteEvent(long id);

    List<E> getAllEvents();

    List<E> getAllEventsByTitle();
    
}
