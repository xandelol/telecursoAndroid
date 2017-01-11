package com.xandecompany.telecursoxandao;

/**
 * Created by Alexandre on 11.01.2017.
 */

public class Movie {
    private String nome;
    private int rating;
    private int year;

    public Movie(String nome, int rating, int year) {
        this.nome = nome;
        this.rating = rating;
        this.year = year;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
