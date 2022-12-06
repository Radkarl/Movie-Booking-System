import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MBS {

    public static void adminPath() {

        try (Scanner scanner = new Scanner(System.in)) {
            Admin admin = new Admin();
            Boolean loop;
            do {
            loop = false;
            System.out.println("Please select an option.");
            System.out.println("1. Status Report");
            System.out.println("2. Add Movie");
            System.out.println("3. Remove Movie");
            System.out.println("4. Change Ticket Price");
            System.out.println("5. Exit");
            System.out.print("Number Selection: ");
            int selection = scanner.nextInt();
            if (selection == 1)
				try {
					admin.StatusReport();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			else if (selection == 2) {
                System.out.println("Adding movie.");
                System.out.print("Movie index: ");
                int mi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Movie name: ");
                String mn = scanner.nextLine();
                //scanner.nextLine();
                System.out.print("Runtime: ");
                String rt = scanner.nextLine();
                //scanner.nextLine();
                System.out.print("Genre: ");
                String g = scanner.nextLine();
                //scanner.nextLine();
                admin.AddMovie(String.valueOf(mi), mn, rt, g);
                admin.AddShowtime(Integer.valueOf(mi), scanner);
            }
            else if (selection == 3) {
                try {
					admin.StatusReport();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("Which movie would you like to remove?");
                admin.RemoveMovie(scanner.nextInt());
            }
            else if (selection == 4) {
                Ticket ticket=new Ticket();
                System.out.println("the current price is: $"+ticket.GetTicketPrice()+"\n"+"What would you like the price to be:");
                ticket.setPrice(scanner.nextDouble());
                
            }

            System.out.print("Continue? (y/n) ");
            char adminContinue = scanner.next().charAt(0);
            if (adminContinue == 'y') loop = true;
            else System.out.println("Logged out.");
        } while (loop);
            
        }

    }

    public static void main(String[] args) {

        
        
    	
    	int MenuChoice=0;
        try (Scanner scanner = new Scanner(System.in)) {
        	
            
            //admin/user login
        	System.out.println("1. Admin login ");
        	System.out.println("2. User login ");
        	System.out.println("3. Create User");
        	MenuChoice=scanner.nextInt();
            // give admin users special privileges
        	scanner.nextLine();

        	if (MenuChoice==1){
        		// admin menu
        		//Braden

                // ADMIN LOG IN
                Boolean canProceed = false;
                System.out.println("Enter Admin Name:");
                String adminName = scanner.nextLine();
                System.out.println("Enter Admin Password:");
                String adminPassword = scanner.nextLine();

                BufferedReader reader;
                try {
                    reader = new BufferedReader(new FileReader(
                            "Admin.txt"));
                    String line = reader.readLine();
                    while (line != null) {
                        String[] str = line.split(" "); 
                        if (adminName.equals(str[0]) && adminPassword.equals(str[1])) canProceed = true;
                        // read next line
                        line = reader.readLine();
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                if (canProceed) {
                    System.out.println("Login Successful. \nWelcome to the MBS, " + adminName + ".");
                    // IF SUCCESSFUL LOGIN, TAKE ADMIN PATH
                    adminPath();
                } 
                else {
                    System.out.println("Login Unsuccessful.");
                    
                }
        	}
                // END ADMIN LOG IN
                
                else if (MenuChoice==2){
        		//user login
        		// Edwin
        		
        		 Customer cust= new Customer();
        		 BookTicket book=new BookTicket();
        		 Cart cart= new Cart();
        		 Show show = new Show();
                 
                 boolean Login=false;
                 while(Login==false) {
                	
                	Login=cust.Login();
                 }
                 // have user select a movie and showtime
                 show.addshows();
                 System.out.print(" Which movie would you like to select? ");
                 int movie_answer = scanner.nextInt();
                 System.out.println();

                 Movie movie = new Movie();

                 String found_movie = movie.searchmovie(movie_answer);

                 System.out.println("Displaying " + found_movie + " Showtimes:");

                 show.printshows(movie_answer);
                 System.out.println("Which showtime would you like to select? ");
                 int show_answer = scanner.nextInt();
                 String showtime = show.findTime(movie_answer, show_answer);
                 System.out.println(showtime);
                 System.out.println("1. Write a Review");
                 System.out.println("2. book ticket");
                 MenuChoice=scanner.nextInt();
                 // have user select seats
             
                 if (MenuChoice==1){
                	 //redirect to review screen
                	 //Terrell
                	 movie.addReview();
                 }
                 
                 else if (MenuChoice ==2){
	                 System.out.println(" How many tickets would you like");
	                 int ticketnum=scanner.nextInt();
	                 int x=0;
	                 Ticket TempTicket;
	                 while (x < ticketnum) {
	                 TempTicket=new Ticket(movie_answer);
	                 cart.Addticket(TempTicket);
	                 x=x+1;
                 }
                 book.Book(cart);
                 // have user purchase ticket(s)
                 // display ticket info
                 System.out.println(showtime);
                 }
        	}
                else if (MenuChoice==3) {
                	Customer cust= new Customer();
                	BookTicket book=new BookTicket();
           		 	Cart cart= new Cart();
           		 	Show show = new Show();
                	cust.RegisterUser();
                	boolean Login=false;
                    while(Login==false) {
                   	
                   	Login=cust.Login();
                    }
                    // have user select a movie and showtime
                    show.addshows();
                    System.out.print(" Which movie would you like to select? ");
                    int movie_answer = scanner.nextInt();
                    System.out.println();

                    Movie movie = new Movie();

                    String found_movie = movie.searchmovie(movie_answer);

                    System.out.println("Displaying " + found_movie + " Showtimes:");

                    show.printshows(movie_answer);
                    System.out.println("Which showtime would you like to select? ");
                    int show_answer = scanner.nextInt();
                    String showtime = show.findTime(movie_answer, show_answer);
                    System.out.println(showtime);
                    System.out.println("1. Write a Review");
                    System.out.println("2. book ticket");
                    MenuChoice=scanner.nextInt();
                    // have user select seats
                
                    if (MenuChoice==1){
                   	 //redirect to review screen
                   	 //Terrell
                   	 movie.addReview();
                   	 System.out.println("System exiting review proccesed");
                    }
                    
                    else if (MenuChoice ==2){
   	                 System.out.println(" How many tickets would you like");
   	                 int ticketnum=scanner.nextInt();
   	                 Seat seat = new Seat();
   	                 seat.list();
   	                 int x=0;
   	                 Ticket TempTicket;
   	                 while (x < ticketnum) {
   	                 TempTicket=new Ticket(movie_answer);
   	                 cart.Addticket(TempTicket);
   	                 x=x+1;
                    }
                    book.Book(cart);
                    // have user purchase ticket(s)
                    // display ticket info
                    
                    }
                }

            //// once logged in:
            // display movies + showtimes
           
            // allow user to write review




        }
        

        

        


        

    }

}

        


        

    


