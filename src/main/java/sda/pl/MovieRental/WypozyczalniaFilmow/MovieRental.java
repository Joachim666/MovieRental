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

    public void addMovie(Movies movie) {
    }

    public Movies getMovieById(String id) {
        return null;
    }

    public Movies getMovieByTitle(String title) {
        return null;
    }

    public List<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customers> customersList) {
        this.customersList = customersList;
    }

    public List<Movies> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movies> moviesList) {
        this.moviesList = moviesList;
    }
}