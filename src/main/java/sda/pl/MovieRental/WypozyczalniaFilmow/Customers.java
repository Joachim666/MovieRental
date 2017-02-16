package sda.pl.MovieRental.WypozyczalniaFilmow;

/**
 * Created by Jojo on 19.01.2017.
 */
public class Customers {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String idNumber;

    public Customers(String firstName, String lastName, int birthYear, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.idNumber = idNumber;


    }

    public Customers(String text) {
        String[] split = text.split(",");
        firstName = split[0];
        lastName = split[1];
        birthYear = Integer.parseInt(split[2]);
        idNumber = split[3];


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        return idNumber != null ? idNumber.equals(customers.idNumber) : customers.idNumber == null;
    }


}
