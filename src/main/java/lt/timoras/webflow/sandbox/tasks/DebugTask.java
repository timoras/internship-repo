package lt.timoras.webflow.sandbox.tasks;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class DebugTask {
    private static final Log log = LogFactory.getLog(DebugTask.class);
    public String startWith() {
        return "start";
    }

    public void error(Object o) {
        log.error(o);
    }
}
