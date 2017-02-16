package sda.pl.MovieRental.WypozyczalniaFilmow;

import org.joda.time.DateTime;

import java.util.Random;

/**
 * Created by Jojo on 16.02.2017.
 */
public class Rental {
    Customers customers;
    Movies movies;
    DateTime startTime;
    DateTime endTime;
    String Id;

    public Rental(Customers customers, Movies movies) {
        this.customers = customers;
        this.movies = movies;
        this.startTime = startTime;
        this.endTime = endTime;
        int random = new Random().nextInt(1000);
        Id = String.valueOf(random);
    }

    public Customers getCustomers() {
        return customers;
    }



    public Movies getMovies() {
        return movies;
    }




    public DateTime getStartTime() {
        return startTime;
    }



    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public String getId() {
        return Id;
    }



}

