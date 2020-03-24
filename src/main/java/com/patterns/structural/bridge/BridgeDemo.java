package com.patterns.structural.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John wick");
        movie.setRuntime("2:45");
        movie.setYear("2020");

        Formatter formatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(formatter);
        System.out.println(printedMaterial);

        HtmlFormatter htmlFormatter = new HtmlFormatter();
        String htmlFormat = moviePrinter.print(htmlFormatter);
        System.out.println(htmlFormat);

    }
}
