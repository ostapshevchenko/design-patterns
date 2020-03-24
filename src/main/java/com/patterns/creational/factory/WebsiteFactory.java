package com.patterns.creational.factory;

import com.patterns.creational.factory.website.Blog;
import com.patterns.creational.factory.website.ShopWebsite;
import com.patterns.creational.factory.website.Website;
import com.patterns.creational.factory.website.WebsiteType;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG : {
                return new Blog();
            }
            case SHOP : {
                return new ShopWebsite();
            }
            default: {
                return null;
            }
        }
    }

}
