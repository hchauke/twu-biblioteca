package com.twu.biblioteca.classes;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Movie;

import java.util.ArrayList;

public class Persistence {
    private static ArrayList<Book> books = new ArrayList<Book>();
    private static ArrayList<Movie> movies = new ArrayList<Movie>();

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        Persistence.books.add(book);
    }

    public static Book getBookAt(int index) throws IndexOutOfBoundsException {
        return Persistence.getBooks().get(index);
    }

    public static ArrayList<Movie> getMovies() {
        return movies;
    }

    public static void addMovie(Movie movie) {
        movies.add(movie);
    }
}
