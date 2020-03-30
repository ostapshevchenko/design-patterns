package com.patterns.structural.facade;

public class FacadeDemo {

    public static void main(String[] args) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        jdbcFacade.insertIntoTable();

        jdbcFacade.getAddresses();
    }
}
