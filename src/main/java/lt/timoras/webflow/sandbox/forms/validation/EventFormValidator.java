package lt.timoras.webflow.sandbox.forms.validation;

import lt.timoras.webflow.sandbox.forms.EventForm;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Component;

@Component
public class EventFormValidator {

    public void validateEvents(EventForm eventForm, ValidationContext context) {
        MessageContext messages = context.getMessageContext();
        if (eventForm.getTicketsNumber() <= 0) {
            messages.addMessage(new MessageBuilder().error().source("ticketsNumber").
                    defaultText("Too few tickets").build());
        }
    }
}
