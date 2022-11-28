import java.util.ArrayList;
import java.util.Random;

public class Cart {
	//Members
	private ArrayList<Ticket> ticketList;
	private String CartID; // this may not be needed depending on how user is set. user could just have a cart as a member to their object
	//End members
	
	// Generators
	public Cart() {
		CartID=null;
		ticketList= new ArrayList<Ticket>();
	}
	public Cart(String pasword) {
		CartID=pasword;
		ticketList= new ArrayList<Ticket>();
	//End Generators
		
	//Methods
	}
	public  void Addticket(Ticket a) {
		ticketList.add(a);
		
	}
	public void DeleteTicket(Ticket a) {
		   for(int i=0;i<ticketList.size();i++){
	            Ticket temp=ticketList.get(i);
	            if (temp.GetTicketNum().equals(a.GetTicketNum())){
	                ticketList.remove(i);
	            }
	        }
	}
	public String toString() {
		String temp="";
		 for(int i=0;i<ticketList.size();i++){
	            temp=temp+ticketList.get(i);
	        }
		 
		return temp;
	}
	//End Methods

}
