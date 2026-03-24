import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) {
        File input = new File("src/movies_data.csv");
        ArrayList<Movie> movieArrayList = new ArrayList<Movie>();
        try {
            Scanner scan = new Scanner(input);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        while (){

        }
    }
}
