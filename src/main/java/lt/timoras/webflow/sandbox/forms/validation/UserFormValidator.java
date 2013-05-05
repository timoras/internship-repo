package lt.timoras.webflow.sandbox.forms.validation;

import com.google.common.base.Strings;
import lt.timoras.webflow.sandbox.forms.UserForm;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * Created with IntelliJ IDEA.
 * User: tomas
 * Date: 5/5/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UserFormValidator {

    public void validateUserLogin(UserForm userForm, ValidationContext context) {
        MessageContext messages = context.getMessageContext();
        String userName = userForm.getUserName();
        if (Strings.isNullOrEmpty(userName)) {
            messages.addMessage(new MessageBuilder().error().source("userName").
                    defaultText("Enter username").build());
        }
        String password = userForm.getPassword();
        if (Strings.isNullOrEmpty(password)) {
            messages.addMessage(new MessageBuilder().error().source("password").
                    defaultText("Enter password").build());
        } else {
            if (password.length() < 5) {
                messages.addMessage(new MessageBuilder().error().source("password").
                        defaultText("Incorrect password").build());
            }
        }
    }

    public void validateEnterName(UserForm userForm, Errors errors) {
        String userName = userForm.getUserName();
        if (Strings.isNullOrEmpty(userName) || userName.length() < 3) {
            errors.rejectValue("userName", "", "Name is too short");
        }
    }
}
