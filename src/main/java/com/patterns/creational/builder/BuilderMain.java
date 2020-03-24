package com.patterns.creational.builder;

import com.patterns.creational.builder.model.LunchOrderBean;
import com.patterns.creational.builder.model.LunchOrderWithBuilder;

public class BuilderMain {

    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean("Wheat", "Condiments", "dressing", "Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

        LunchOrderWithBuilder.LunchBuilder lunchBuilder = new LunchOrderWithBuilder.LunchBuilder();
        lunchBuilder.bread("Bread").condiments("condiments").dressing("dressing").meat("meat");
        LunchOrderWithBuilder lunchOrder = lunchBuilder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
