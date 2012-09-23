package lt.timoras.webflow.sandbox.flow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
public class FlowStartController {

    @RequestMapping(value = "/flow/start", method = RequestMethod.GET)
    public String doStuff() {
        return "flow-start";
    }

}

