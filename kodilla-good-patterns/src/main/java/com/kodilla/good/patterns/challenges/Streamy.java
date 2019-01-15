package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Streamy {
    public static void main(String args[]){
        MovieStore movieStore = new MovieStore();
        String theResultStringMovieStore = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(theResultStringMovieStore);
    }
}
