public class Movie {
    
    // MEMBERS
    public int movie_id;
    public String movie_name;
    public float movie_runtime;
    public String movie_type;
    // END MEMBERS

    // METHODS
    public void searchmovie(){
    }
    public void set_id(int movie_id){
        this.movie_id = movie_id;
    }
    public void set_name(String movie_name) {
        this.movie_name = movie_name;
    }
    public void set_runtime(float movie_runtime) {
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
    public float get_runtime() {
        return movie_runtime;
    }
    public String get_type() {
        return movie_type;
    }
    // END METHODS

}
