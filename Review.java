public class Review {
    
    // MEMBERS
    private int rating;
    private String complaint;
    private String compliment;
    // END MEMBERS


    // METHODS
    public void set_rating(int rating) {
        this.rating = rating;
    }

    public void set_complaint(String complaint) {
        this.complaint = complaint;
    }

    public void set_compliment(String compliment) {
        this.compliment = compliment;
    }

    public void get_rating() {
        System.out.println(rating); // REPLACE WITH SPRING UI
    }

    public void get_complaint() {
        System.out.println(complaint); // REPLACE WITH SPRING UI
    }

    public void get_compliment() {
        System.out.println(compliment); // REPLACE WITH SPRING UI
    }

    // recieve feedback() ?
    // END METHODS


}