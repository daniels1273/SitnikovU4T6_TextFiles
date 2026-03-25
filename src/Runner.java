import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        File input = new File("src/movies_data.csv");
        ArrayList<Movie> movies = new ArrayList<Movie>();
        double totalUserRating = 0;
        double totalRuntime = 0;
        int movieAmount = 0;

        try {
            Scanner scan = new Scanner(input);
            scan.nextLine();
            while (scan.hasNext()) {
                String[] traits = scan.nextLine().split(",");
                Movie movie = new Movie(traits[0], traits[1], traits[2], traits[3], Integer.parseInt(traits[4]), Double.parseDouble(traits[5]));
                movies.add(movie);
                movieAmount++;
                totalRuntime += movie.getRuntime();
                totalUserRating += movie.getUserRating();
            }

            System.out.println("Number of movies: " + movies.size());
            System.out.println();
            System.out.println(movies.get(2));
            System.out.println();
            System.out.println(movies.get(4998));
            System.out.println();

        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }
        System.out.println("Average runtime: " + (totalRuntime / movieAmount));
        System.out.println("Average rating: " + (totalUserRating / movieAmount));
    }
}