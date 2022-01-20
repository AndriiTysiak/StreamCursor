package com.company.task3;

public class Movies {
    String nameMovies;
    double price;
    Genre genre;

    public Movies(String nameMovies, double price, Genre genre) {
        this.nameMovies = nameMovies;
        this.price = price;
        this.genre = genre;
    }

    public String getNameMovies() {
        return nameMovies;
    }

    public void setNameMovies(String nameMovies) {
        this.nameMovies = nameMovies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "nameMovies='" + nameMovies + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }
}
