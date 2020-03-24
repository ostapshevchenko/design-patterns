package com.patterns.creational.factory;

import com.patterns.creational.factory.website.Website;
import com.patterns.creational.factory.website.WebsiteType;

public class FactoryMain {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());

    }
}
