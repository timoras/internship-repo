package lt.timoras.webflow.sandbox.forms;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.validation.ValidationContext;

import java.io.Serializable;

public class EventForm implements Serializable {

    private long id;
    private int ticketsNumber = 1;

    public int getTicketsNumber() {
        return ticketsNumber;
    }

    public void setTicketsNumber(int ticketsNumber) {
        this.ticketsNumber = ticketsNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void validateEvents(ValidationContext context) {
        MessageContext messages = context.getMessageContext();
        if (ticketsNumber > 40) {
            messages.addMessage(new MessageBuilder().error().source("ticketsNumber").
                    defaultText("Too much tickets").build());
        }
    }

}
