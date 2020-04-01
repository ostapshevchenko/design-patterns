package com.patterns.structural.proxy;

public interface TwitterService {

    String getTimeLine(String screenName);
    void postToTimeline(String screenName, String message);
}
