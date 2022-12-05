import java.util.Scanner;

public class MBS {

    public static void main(String[] args) {
    	int MenuChoice=0;
        try (Scanner scanner = new Scanner(System.in)) {
        	//admin/user login
        	System.out.println("1. Admin login ");
        	System.out.println("2. User login ");
        	System.out.println("3. Create User");
        	MenuChoice=scanner.nextInt();
            // give admin users special privileges
        	
        	if (MenuChoice==1){
        		// admin menu
        		//Braden
        		
        	}
        	if (MenuChoice==2){
        		//user login
        		// Edwin
        		
        		 Customer cust= new Customer();
        		 BookTicket book=new BookTicket();
        		 Cart cart= new Cart();
        		 Show show = new Show();
                 show.addshows();
                 while(login==false) {
                	 login=cust.login();
                 }
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
                 System.out.println("1. Write a Review");
                 System.out.println("2. book ticket");
                 MenuChoice=scanner.nextInt();
                 // have user select seats
            
                 if (MenuChoice==1){
                	 //redirect to review screen
                	 //Terrell
                	 movie.addReview();
                 }
                 
                 if (MenuChoice ==2){
                 Seat seat = new Seat();
                 seat.list();
                
                 Ticket TempTicket;
                 TempTicket=new Ticket(movie.get_name());
                 cart.Addticket(TempTicket);
                 book.book(cart);
                 
                 // have user purchase ticket(s)
                 // display ticket info
                 System.out.println(found_movie);
                 System.out.println(showtime);
                 }
        	}

            //// once logged in:
            // display movies + showtimes
           
            // allow user to write review




        }
        

        

        


        

    }

}
