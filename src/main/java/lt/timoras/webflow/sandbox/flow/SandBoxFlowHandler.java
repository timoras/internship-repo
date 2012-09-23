package lt.timoras.webflow.sandbox.flow;

import org.springframework.webflow.core.FlowException;
import org.springframework.webflow.mvc.servlet.AbstractFlowHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SandBoxFlowHandler extends AbstractFlowHandler {

    @Override
    public String getFlowId() {
        String flowId = "sandbox-flow";
        return flowId;
    }

    @Override
    public String handleException(FlowException e, HttpServletRequest request, HttpServletResponse response) {

         throw e;

    }

}
