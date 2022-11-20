public class Show {
    
    // MEMBERS
    public int show_id;
    public String show_name;
    public String show_status;
    public int show_date;
    public String show_synopsis;
    public String show_cast;
    // END MEMBERS


    // METHODS
    public void addshows(){}
    public void editshows(){}
    public void show_details(int show_id, String show_name, String show_status, 
        int show_date, String show_synopsis, String show_cast) {
            this.show_id = show_id;
            this.show_name = show_name;
            this.show_status = show_status;
            this.show_date = show_date;
            this.show_synopsis = show_synopsis;
            this.show_cast = show_cast;
        }
    // END METHODS



}
