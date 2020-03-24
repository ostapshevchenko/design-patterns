package com.patterns.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creation patterns java");
        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getRuntime());

        Movie movie2 = (Movie) registry.createItem("Movie");
        System.out.println(movie2);
        System.out.println(movie2.getTitle());
        System.out.println(movie2.getPrice());
        System.out.println(movie2.getRuntime());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("GoF");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getRuntime());
    }
}
