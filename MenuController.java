import java.util.Scanner;

public class MenuController {

	
	public void MainMenu(Cart b)
	{
		Scanner scan= new Scanner(System.in);
		Movie Temp=new Movie();
		System.out.println("1. search");
		System.out.println("2. Veiw Cart");
		System.out.println("3. exit");
	    System.out.println("Enter the Coresponding number:");
	    int choice=scan.nextInt();
	    scan.close();
	    
	    switch(choice)
	    {
	    case(1):{
	    	System.out.println("enter the title of the Movie you want to search for: ");
	    	
	    	//ask if the want to add to cart if yes create ticket add to cart 
	    }
	    case(2):{
	    	System.out.println(b.toString());
	    	this.MainMenu(b);
	    	
	    }
	    case(3):{
	    	//exit / break
	    }
	    }
		}
		

}
