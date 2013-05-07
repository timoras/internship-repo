package lt.timoras.webflow.sandbox.tasks;

import lt.timoras.webflow.sandbox.forms.UserForm;
import lt.timoras.webflow.sandbox.forms.UserRegistrationForm;
import org.springframework.stereotype.Component;

@Component
public class UserTask {

    public UserForm getUserForm() {
        return new UserForm();
    }

    public UserRegistrationForm getUserRegistrationForm() {
        return new UserRegistrationForm();
    }
}
