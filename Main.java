import java.util.Scanner;

public class Main {
	
    
    public static void main(String[] Args) {
    	Cart UserCart= new Cart();
    	MenuController A= new MenuController();
    	Scanner scan= new Scanner(System.in);
    	System.out.println("1. Login");
    	System.out.println("2. Signup");
    	System.out.println("3. exit");
        System.out.println("Enter the Coresponding number:");
        int choice=scan.nextInt();
        scan.close();
         
        switch(choice)
        {
        case(1):{
        	// call login
        	// return T/F upon successful login
        	// add username to cart
        	A.MainMenu(UserCart);
        	
        }
        case(2):{
        	// call sign up
        	// add username to cart
        	A.MainMenu(UserCart);
        	
        }
        case(3):{
        	//exit / break
        }
        }
        
        
         
         
        
        // have user log in here

        // give admin users special privileges

        //// once logged in:
        // display movies + showtimes
        // have user select a movie and showtime
        // have user select seats
        // have user purchase ticket(s)
        // allow user to write review

        
        
     
        
    }

}
