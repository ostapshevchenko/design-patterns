package com.patterns.structural.proxy;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeLine(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
