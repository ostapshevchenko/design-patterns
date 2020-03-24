package com.patterns.creational.builder.model;

public class LunchOrderWithBuilder {

    public static class LunchBuilder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchOrderWithBuilder build() {
            return new LunchOrderWithBuilder(this);
        }

        public LunchBuilder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public LunchBuilder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public LunchBuilder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public LunchBuilder meat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    public LunchOrderWithBuilder(LunchBuilder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }


}
