package sda.pl.MovieRental.WypozyczalniaFilmow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jojo on 19.01.2017.
 */
public class MovieRental {

    private List<Customers> customersList = new ArrayList<>();
    private List<Movies> moviesList = new ArrayList<>();


    public Customers getCustomerById(String id) {

        return customersList.stream().filter(x -> x.getIdNumber().equals(id)).findFirst().orElse(null);


    }

    public Customers getCustomerByFirstAndLastName(String firstName, String lastName) {


        return customersList.stream().filter(x -> x.getFirstName().equals(firstName) && x.getLastName().equals(lastName)).findFirst().orElse(null);

    }

    public void addCustomer(Customers customer) throws CustomerAlreadyExistsExeption {
        boolean exist = customersList.stream().noneMatch(x -> x.getIdNumber().equals(customer.getIdNumber()));
        if (exist){
            customersList.add(customer);
        }else{
            throw new CustomerAlreadyExistsExeption();
        }
    }

    public void addMovie(Movies movie) throws MovieAlreadyExistsExeption {
        boolean existMovie = moviesList.stream().noneMatch(x -> x.getId().equals(movie.getId()));
        if(existMovie){
            moviesList.add(movie);
        }else {
            throw new MovieAlreadyExistsExeption();
        }

    }

    public Movies getMovieById(String id) {

        return moviesList.stream().filter(x->x.getId().equals(id)).findFirst().orElse(null);

    }

    public Movies getMovieByTitle(String title) {

        return moviesList.stream().filter(x->x.getTitle().equals(title)).findFirst().orElse(null);

    }

    public List<Customers> getCustomersList() {
        return customersList;
    }



    public List<Movies> getMoviesList() {
        return moviesList;
    }


}