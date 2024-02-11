package com.vivanchenko.heroku.dto;

public class MonoEvent {
    private String type;
    private MonoEventData data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MonoEventData getData() {
        return data;
    }

    public void setData(MonoEventData data) {
        this.data = data;
    }
}
