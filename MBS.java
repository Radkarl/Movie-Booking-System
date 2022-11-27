import java.util.Scanner;

public class MBS {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // give admin users special privileges



            //// once logged in:
            // display movies + showtimes
            Show show = new Show();
            show.addshows();


            // have user select a movie and showtime
            System.out.print("Which movie would you like to select? (0-9) ");
            int movie_answer = scanner.nextInt();
            System.out.println();

            Movie movie = new Movie();

            String found_movie = movie.searchmovie(movie_answer);

            System.out.println("Displaying " + found_movie + " Showtimes:");

            show.printshows(movie_answer);
            System.out.println("Which showtime would you like to select? (0-9)");
            int show_answer = scanner.nextInt();
            String showtime = show.findTime(movie_answer, show_answer);

            // have user select seats
            System.out.println("Purchase seat by price or seat number? (p/n) ");
            String seat_answer  = scanner.next();

            Seats seat = new Seats();
 
            if (seat_answer.equals("p")) {
                seat.purchaseByPrice();
            } else if (seat_answer.equals("n")) {
                seat.purchaseBySeat();
            }


            // have user purchase ticket(s)
            // display ticket info
            System.out.println(found_movie);
            System.out.println(showtime);
            System.out.println(seat.getSeat());

            // allow user to write review




        }
        

        

        


        

    }

}
