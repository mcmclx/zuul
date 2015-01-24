package com.netflix.zuul.event;

import java.util.HashMap;
import java.util.Map;

/**
 * User: michaels@netflix.com
 * Date: 1/23/15
 * Time: 3:00 PM
 */
public class ZuulUser
{
    private final String userName;
    private final Map<String, Object> attributes = new HashMap<String, Object>();

    public ZuulUser(String userName) {
        if (userName == null)
            throw new IllegalArgumentException("Null userName!");
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "ZuulUser{" +
                "userName='" + userName + '\'' +
                ", attributes=" + attributes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZuulUser zuulUser = (ZuulUser) o;

        if (userName != null ? !userName.equals(zuulUser.userName) : zuulUser.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return userName != null ? userName.hashCode() : 0;
    }
}
