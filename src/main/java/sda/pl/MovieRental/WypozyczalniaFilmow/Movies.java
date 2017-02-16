package sda.pl.MovieRental.WypozyczalniaFilmow;

/**
 * Created by Jojo on 19.01.2017.
 */
public class Movies {
    String title;
    String gere;
    int duration;
    int year;
    String id;

    public Movies(String title, String gere, int duration, int year, String id) {
        this.title = title;
        this.gere = gere;
        this.duration = duration;
        this.year = year;
        this.id = id;
    }
    public void Movies(String text){
        String [] split = text.split(",");

        title = split[0];
        gere = split[1];
        duration = Integer.parseInt(split[2]);
        year = Integer.parseInt(split[3]);
        id = split[4];

    }

    public String getTitle() {
        return title;
    }

    public String getGere() {
        return gere;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movies movies = (Movies) o;


        return id != null ? id.equals(movies.id) : movies.id == null;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", gere='" + gere + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", id='" + id + '\'' +
                '}';
    }
}
