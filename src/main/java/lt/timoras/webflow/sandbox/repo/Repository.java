package lt.timoras.webflow.sandbox.repo;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import lt.timoras.webflow.sandbox.domain.Event;
import lt.timoras.webflow.sandbox.domain.Order;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lt.timoras.webflow.sandbox.domain.Event.EventType.CONFERENCE;
import static lt.timoras.webflow.sandbox.domain.Event.EventType.JUG;

@Component
public class Repository {


    private Map<Long, Event> events = ImmutableMap.of(
            1L, new Event(1L, "GeeCon", CONFERENCE, new DateTime(2013, 4, 10, 19, 0)),
            2L, new Event(2L, "Jug14", JUG, new DateTime(2013, 4, 10, 19, 0)),
            3L, new Event(3L, "Jug15", JUG, new DateTime(2013, 6, 8, 19, 0))
    );

    public List<Event> getEvents() {
        return ImmutableList.copyOf(events.values());

    }

    public Event getEvent(long eventId) {
        return events.get(eventId);
    }

    private static Map<Long, Order> orders = new HashMap<Long, Order>();

    public long createOrder(Order order) {
        long newOrderId = orders.size() + 1;
        orders.put(newOrderId, order);
        return newOrderId;
    }


    public Order getOrder(long orderId) {
        return orders.get(orderId);
    }
}
