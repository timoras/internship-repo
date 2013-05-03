package lt.timoras.webflow.sandbox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {

    @RequestMapping(value = "/layouts/decorator")
    public String layout() {
        return "layouts/decorator";
    }

}

