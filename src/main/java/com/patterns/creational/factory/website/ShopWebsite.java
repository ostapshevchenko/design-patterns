package com.patterns.creational.factory.website;

import com.patterns.creational.factory.pages.CartPage;
import com.patterns.creational.factory.pages.ItemPage;
import com.patterns.creational.factory.pages.SearchPage;

public class ShopWebsite extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
