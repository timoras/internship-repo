package lt.timoras.webflow.sandbox.domain;

import org.joda.time.DateTime;

import java.util.Date;

public class Event {
    public enum EventType {
        JUG, CONFERENCE, WORKSHOP
    }

    private final long id;
    private final String name;
    private final EventType type;
    private final Date date;

    public Event(long id, String name, EventType type, DateTime date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.date = date.toDate();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EventType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }
}
