package com.company.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Movies> moviesList1 = new ArrayList<>();
        moviesList1.add(new Movies("SFDFD", 120, Genre.ACTION));
        moviesList1.add(new Movies("GFFGFG", 150, Genre.ROMANTIC_COMEDY));
        moviesList1.add(new Movies("GFFGFG", 101, Genre.ROMANTIC_COMEDY));
        moviesList1.add(new Movies("GFFGFG", 100, Genre.ROMANTIC_COMEDY));
        moviesList1.add(new Movies("SFDFD", 106, Genre.ACTION));
        List<Movies> moviesList2 = new ArrayList<>();
        moviesList2.add(new Movies("ASSDF", 105, Genre.DRAMA));
        moviesList2.add(new Movies("ASSDF", 170, Genre.DRAMA));
        moviesList2.add(new Movies("ERFDDD", 101, Genre.DOCUMENTARY));
        List<List<Movies>> list = new ArrayList<>();
        list.add(moviesList1);
        list.add(moviesList2);
        var listOfAllGenre = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        Supplier<Stream<Movies>> streamOfMovies = listOfAllGenre::stream;
        var countMovies = streamOfMovies.get()
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.counting()));
        System.out.println(countMovies);
        var actionAveragePrice = streamOfMovies.get()
                .filter(it -> it.getGenre() == Genre.ACTION)
                .collect(Collectors.averagingDouble(Movies::getPrice));
        System.out.println("Average price of Acton is :" + actionAveragePrice);
        var romanticComedyAveragePrice = streamOfMovies.get()
                .filter(it -> it.getGenre() == Genre.ROMANTIC_COMEDY)
                .collect(Collectors.averagingDouble(Movies::getPrice));
        System.out.println("Average price of Romantic Comedy is :" + romanticComedyAveragePrice);
        var dramaAveragePrice = streamOfMovies.get()
                .filter(it -> it.getGenre() == Genre.DRAMA)
                .collect(Collectors.averagingDouble(Movies::getPrice));
        System.out.println("Average price of Drama is :" + dramaAveragePrice);
        var documentaryAveragePrice = streamOfMovies.get()
                .filter(it -> it.getGenre() == Genre.DOCUMENTARY)
                .collect(Collectors.averagingDouble(Movies::getPrice));
        System.out.println("Average price of Documentary is :" + documentaryAveragePrice);
    }
}
