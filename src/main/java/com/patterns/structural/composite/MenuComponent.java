package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        return builder.append(": ")
                .append(url)
                .append("\n").toString();
    }
}
