
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BookTicket {
	//Members
	private String cardNumber;
	private String securityCode;
	private String expDate;
	Scanner scan= new Scanner(System.in);
	//End Members
	
	//Methods
	public BookTicket() {
		
	}
	
	public void Book(Cart b) {
		boolean temp= this.GetcardNumber();
		if(temp==true) {
			this.GetSecurityCode();
			if(temp==true) {
				this.GetExpDate();
				if(temp==true) {
					System.out.println("Save the Ticket Numbers and present them at the ticket counter upon arival");
					System.out.println(b.toString());
				}
				else {
					System.out.println("Not a Valid Card");
					Book(b);
				}
			}
			else {
				System.out.println("Not a Valid Card");
				Book(b);
			}
		}
			
		else {
			System.out.println("Not a Valid Card");
			Book(b);
			
		}
		
	}
	
	
	
	
	
	public boolean GetcardNumber() {
		System.out.println("Enter your card number(XXXXXXXXXXXXXXXX):");
		cardNumber= scan.next();
		BufferedReader input= null;
        try{
        input =new BufferedReader(new FileReader("Card_Database.txt"));
        String temp=input.readLine();
        while(temp!=null) {
        	String[] words=temp.split(" ");
        	
        	if(cardNumber.equals(words[0])) {
        		input.close();
        		return true;
        	}
        	temp= input.readLine();
        }
        }
        catch(FileNotFoundException e)
        {

        } catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean GetSecurityCode() {
		System.out.println("Enter your security code:");
		securityCode= scan.next();
		
		BufferedReader input= null;
        try{
        input =new BufferedReader(new FileReader("Card_Database.txt"));
        String temp=input.readLine();
        
        while(temp!=null) {
        	String[] words=temp.split(" ");
        	if(securityCode.equals(words[1])) {
        		input.close();
        		return true;
        	}
        	temp= input.readLine();
        }
        }
        catch(FileNotFoundException e)
        {

        } catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean GetExpDate() {
		System.out.println("Enter your experation date (mm/yyyy):");
		expDate= scan.next();
		BufferedReader input= null;
        try{
        input =new BufferedReader(new FileReader("Card_Database.txt"));
        String temp=input.readLine();
        
        while(temp!=null) {
        	String[] words=temp.split(" ");

        	if(expDate.equals(words[2])) {
        		input.close();
        		return true;
        	}
        	temp= input.readLine();
        }
        }
        catch(FileNotFoundException e)
        {

        } catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	//End Methods
	
	
}
