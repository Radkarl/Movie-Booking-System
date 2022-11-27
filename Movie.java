import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Movie {
    
    // MEMBERS
    private int movie_id;
    private String movie_name;
    private String movie_runtime;
    private String movie_type;
    // END MEMBERS

    // METHODS
    public String searchmovie(int id){
        String needed_movie = "";
        BufferedReader reader;
        try {
			reader = new BufferedReader(new FileReader(
					"movies.txt"));
			String line = reader.readLine();
            line = reader.readLine();
			while (Integer.valueOf(line.substring(0,1)) != id) {
				
				// read next line
				line = reader.readLine();
			}
            String[] str = line.split("\\. "); 
            String[] str1 = str[1].split("\\, ");
            //System.out.println("Displaying " + str1[0] + " Showtimes:");
			reader.close();
            needed_movie = str1[0];
            return needed_movie;
		} catch (IOException e) {
			e.printStackTrace();
		}

        return needed_movie;
    }
    public void set_id(int movie_id){
        this.movie_id = movie_id;
    }
    public void set_name(String movie_name) {
        this.movie_name = movie_name;
    }
    public void set_runtime(String movie_runtime) {
        this.movie_runtime = movie_runtime;
    }
    public void set_type(String movie_type) {
        this.movie_type = movie_type;
    }
    public int get_id() {
        return movie_id;
    }
    public String get_name() {
        return movie_name;
    }
    public String get_runtime() {
        return movie_runtime;
    }
    public String get_type() {
        return movie_type;
    }
    // END METHODS

}

