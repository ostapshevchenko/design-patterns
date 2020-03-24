package com.patterns.creational.factory.website;

import com.patterns.creational.factory.pages.AboutPage;
import com.patterns.creational.factory.pages.CommentPage;
import com.patterns.creational.factory.pages.ContactPage;
import com.patterns.creational.factory.pages.PostPage;

public class Blog extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }

    public Blog() {
    }
}
