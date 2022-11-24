

import java.util.Scanner;


public class Customer
{
		
		Scanner scanner = new Scanner(System.in);
		
		private string Name;
		
		private string password;
		
		private string email;
		
		private string PhoneNumber;
		
		private string address;
		
		
		// Customer Constructor
		
		Customer(String name, String pwd, String emailaddress, String num, String homeaddress)
		{
			this.Name = name;
			this.password = pwd;
			this.email = emailaddress;
			this.phoneNumber = num;
			this address = homeaddress;
		
		
		}
		
		
		
			Customer(){
		
		}
		
		
		public void RegisterCustomer()
		
		{
			try
			{
				System.out.println("Enter name");
				
				
				String name = scanner.nextLine();
				
				if(this.isAlpha(name) == true)
			{
					SetName(name);
				
			}
			else
			{
				 throw new InvalidNameException("The Name contains numeric values please input again")
				
				
				
			}
			
				System.out.println("Enter customer password");
			
				String pwd = scanner.nextLine();
			
				if(this.isalnum(pwd) == true)
			{
				SetPassword(pwd);
			
			}
			else
			{
				throw new InvalidPasswordException("The password needs to have alphabets and numbers please input again");
			
			
			}
				
				System.out.println("Enter valid email address");
				String emailaddress = scanner.nextLine();
				if(this.isAlpha(emailaddress) == true)
			{
			
				SetEmail(emailaddress);
				
			}
			else
			{
				
				throw new InvalidemailException("The email contains numeric values please input again ");
			
			}
				
				
				System.out.println("Enter phone number");
    
				String num = scanner.nextLine();
        
				if(this.isNumeric(num)==true)
			{
				SetNumber(num);
			}
				else
			{
				throw new InvalidPhoneNumberException("The phone number should be numeric");
			}
				
				System.out.println("Enter valid home address");
				String homeaddress = scanner.nextLine();
				if(this.isalnum(pwd) == true)
			{
			
				SetAddress(homeaddress);
				
				
			}
				else
			{
				
				throw new InvalidaddressException("The phone number should be numeric");
			
			}
			
				catch(InvalidNameException e)
			{
					RegisterCustomer;
				
				
			}
				
				catch(InvalidPasswordException e)
			{
					RegisterCustomer;
					
			}
				catch(InvalidemailException e)
			{
				RegisterCustomer;
				
			}
			
				catch(InvalidPhoneNumberException e)
			{
				RegisterCustomer;
			
			}
				catch(InvalidaddressException e)
			
			{
				RegisterCustomer;
			
			
			}
			
			
			}
		
		
		}
		
		
				public void SetName(String name)
		{
				this.Name = name;
		
		
		}
		
				public String GetName()
		{
				return this.Name;
		
		
		}
		
				public void SetPassword(String password)
		{
				this.password = pwd;
		
		}
		
				public String GetPassword()
		{
				return this.password;
		
		}
		
				public void SetAddress(String email)
				
		{
				this.email = emailaddress;
		
		
		}
				public String GetEmail()
		{
		
				return this.email;
		
		}
				public void SetNumber(String PhoneNumber)
		{
				this.PhoneNumber = num;
				
		
		}
		
				public String GetNumber()
		{
				return this.PhoneNumber;
		
		}
		
				public void SetAddress(String address)
		{
				this.address = homeaddress;
		
		
		}
		
				public String GetAddress()
		{
				return this.address;
		
		}
			
				 public boolean isNumeric(String s) {  
				return s.matches("[-+]?\\d*\\.?\\d+");  
		}
				public boolean isAlpha(String name) {
				return name.matches("[a-zA-Z]+");
		}
		
				public boolean isAlpha(String email) {
				return name.matches("[a-zA-Z]+");
		}
		
		
		
		
		
		


}