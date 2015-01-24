package com.netflix.zuul.event;

/**
 * User: michaels@netflix.com
 * Date: 1/22/15
 * Time: 5:35 PM
 */
public class ZuulFilterEvent extends ZuulEvent {

    private ZuulFilterEventType eventType;
    private String filterId;
    private int filterRevision;
    private ZuulUser user;

    public ZuulFilterEvent(ZuulFilterEventType eventType, String filterName, int filterRevision, ZuulUser user) {
        super(null, null);
        this.eventType = eventType;
        this.filterId = filterName;
        this.filterRevision = filterRevision;
        this.user = user;
    }

    public String getFilterId() {
        return filterId;
    }

    public int getFilterRevision() {
        return filterRevision;
    }

    public ZuulUser getUser() {
        return user;
    }

    public ZuulFilterEventType getFilterEventType() {
        return this.eventType;
    }

    public String getEventType() {
        return this.eventType.name();
    }
    public String getEventMessage() {
        return String.format("Zuul filter event. type=%s, id=%s, revision=%s, user=%s", eventType.name(), filterId, filterRevision, user);
    }
}
