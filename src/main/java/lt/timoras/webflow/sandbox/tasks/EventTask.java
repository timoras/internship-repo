package lt.timoras.webflow.sandbox.tasks;

import lt.timoras.webflow.sandbox.domain.Event;
import lt.timoras.webflow.sandbox.domain.Order;
import lt.timoras.webflow.sandbox.forms.EventForm;
import lt.timoras.webflow.sandbox.repo.Repository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class EventTask {

    @Resource
    private Repository repository;

    public List<Event> getEvents() {
        return repository.getEvents();
    }

    public EventForm getForm() {
        return new EventForm();
    }

    public long createOrder(long eventId, int tickets) {
        Order order = new Order();
        order.setEventId(eventId);
        return repository.createOrder(order);
    }

    public Event.EventType getEventType(long orderId) {
        long eventId = repository.getOrder(orderId).getEventId();
        return repository.getEvent(eventId).getType();
    }
}
