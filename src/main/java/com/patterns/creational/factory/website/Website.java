package com.patterns.creational.factory.website;

import com.patterns.creational.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    protected abstract void createWebsite();
}
