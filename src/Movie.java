import java.util.Arrays;

public class Movie {

    private String title;
    private String[] cast;
    private String director;
    private String overview;
    private int runtime;
    private double userRating;

    public Movie(String title, String cast, String director, String overview, int runtime, double rating){
        this.title = title;
        this.cast = cast.split("\\|");
        this.director = director;
        this.overview = overview;
        this.runtime = runtime;
        this.userRating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String[] getCast() {
        return cast;
    }

    public String getDirector() {
        return director;
    }

    public String getOverview() {
        return overview;
    }

    public int getRuntime() {
        return runtime;
    }

    public double getUserRating() {
        return userRating;
    }

    @Override
    public String toString(){
        return "TITLE: " + title + "\n" +
                "CAST: " + Arrays.toString(cast) + "\n" +
                "DIRECTOR: " + director + "\n" +
                "OVERVIEW: " + overview + "\n" +
                "RUNTIME: " + runtime + "\n" +
                "USER RATING: " + userRating;
    }
}