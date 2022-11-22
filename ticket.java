
import java.util.Random;

public class ticket {
	//MEMBERS
	private String movieName;
	private String ticketNum;
	private int seatNum;
	// END MEMBERS
	
	//METHODS
	public ticket() {
		seatNum=0;
		movieName=null;
		genTicketNum();
		
	}
	public ticket(String movie,int SeatNum) {
		movieName=movie;
		genTicketNum();
		seatNum=SeatNum;
	}
	
	//Get and Set Functions
	public void SetMovieName(String A) {
		movieName=A;
	}
	public void SetSeatNum(int A) {
		seatNum=A;
	}
	public String GetMovieName() {
		return movieName;
	}
	public int GetSeatNum() {
		return seatNum;
	}
	public String GetTicketNum() {
		return ticketNum;
	}
	
	//toString
	public String toString() {
		String temp="Movie Name: "+ movieName+"\n"+"Seat Number: "+seatNum+"\n"+"Ticket Number: "+ticketNum+"\n";
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
