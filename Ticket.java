
import java.util.Random;

public class Ticket {
	//MEMBERS
	private int movieName;
	private String ticketNum;
	private double TicketPrice;
	
	// END MEMBERS
	
	//METHODS
	public Ticket() {
		
		movieName=0;
		genTicketNum();
		TicketPrice=10;
		
	}
	public Ticket(int movie) {
		movieName=movie;
		genTicketNum();
		
	}
	
	//Get and Set Functions
	public void SetMovieName(int A) {
		movieName=A;
	}
	public int GetMovieName() {
		return movieName;
	}
	
	public String GetTicketNum() {
		return ticketNum;
	}
	public double GetTicketPrice() {
		return TicketPrice;
	}
	public void setPrice(double x) {
		TicketPrice=x;
	}
	//toString
	public String toString() {
		String temp="Movie Name: "+ movieName+"\n"+"Ticket Number: "+ticketNum+"\n";
		return temp;
	}
	
	//Func to Gen Unique ticket ID
	private void genTicketNum() {
		String Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
		  String temp="";
		  for(int j=0;j<8;j++)
		    {
		      Random r= new Random();
		      char t=(Alphabet.charAt(r.nextInt(Alphabet.length())));
		      temp=temp+t;
		    }
		  this.ticketNum=temp;
	}
	//END METHODS

}
