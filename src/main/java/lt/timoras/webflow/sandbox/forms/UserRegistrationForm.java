package lt.timoras.webflow.sandbox.forms;

import com.google.common.base.Strings;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.binding.validation.ValidationContext;

import java.io.Serializable;

import static com.google.common.base.Strings.*;

public class UserRegistrationForm implements Serializable {
    private String firstName        ;
    private String lastName         ;
    private String userName             ;
    private String password         ;
    private String creditCardNumber ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void validateRegisterUser(ValidationContext context) {
        MessageContext messages = context.getMessageContext();
        if (isNullOrEmpty(firstName)) {
            messages.addMessage(new MessageBuilder().error()
                    .source("firstName").defaultText("enter value").build());
        }
        if (isNullOrEmpty(lastName)) {
            messages.addMessage(new MessageBuilder().error()
                    .source("lastName").defaultText("enter value").build());
        }
        if (isNullOrEmpty(userName))
            messages.addMessage(new MessageBuilder().error()
                    .source("userName").defaultText("enter value").build());
        if (isNullOrEmpty(password)) {
            messages.addMessage(new MessageBuilder().error()
                    .source("password").defaultText("enter value").build());
        }
        if (isNullOrEmpty(creditCardNumber)) {
            messages.addMessage(new MessageBuilder().error()
                    .source("creditCardNumber").defaultText("enter value").build());
        }
    }

}
