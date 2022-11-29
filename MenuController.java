import java.util.Scanner;

public class MenuController {

	
	public void MainMenu(Cart b)
	{
		Scanner scan= new Scanner(System.in);
		Movie TempMovie=new Movie();
		Ticket TempTicket;
		BookTicket TempBook=new BookTicket();
		System.out.println("1. search");
		System.out.println("2. Veiw Cart");
		System.out.println("3. Checkout");
		System.out.println("4. exit");
	    System.out.println("Enter the Coresponding number:");
	    int choice=scan.nextInt();
	    scan.close();
	    
	    switch(choice)
	    {
	    case(1):{
	    	System.out.println("enter the title of the Movie you want to search for: ");
	    	String Search=scan.next();
	    	TempMovie.searchmovie(Search);
	    	System.out.println("Would you like to add this to your cart:");
	    	String Reply=scan.next();
	    	if(Reply.equals("yes")) {
	    	TempTicket=new Ticket(TempMovie.searchmovie(Search));
	    	b.Addticket(TempTicket);
	    	this.MainMenu(b);
	    	}
	    	else {
	    		this.MainMenu(b);
	    	}
	    }
	    case(2):{
	    	System.out.println(b.toString());
	    	this.MainMenu(b);
	    	
	    }
	    case(3):{
	    	TempBook.Book(b);
	    	
	    }
	    }
		}
	public void AdminMenu() {
		// add Menu Functions for Admin Here
	}

}
