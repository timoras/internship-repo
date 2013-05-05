package lt.timoras.webflow.sandbox.tasks;

import lt.timoras.webflow.sandbox.domain.Event;
import lt.timoras.webflow.sandbox.repo.Repository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: tomas
 * Date: 5/5/13
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class PaymentTask {

    @Resource
    private Repository repository;

    public boolean needsPayment(long orderId) {
        long eventId = repository.getOrder(orderId).getEventId();
        Event event = repository.getEvent(eventId);
        return event.getType() == Event.EventType.CONFERENCE;
    }
}
