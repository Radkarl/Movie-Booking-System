import java.io.File;
import java.util.Scanner;



//Initializing User
public class Customer
{
	

	Scanner scanner = new Scanner(System.in);

		private String Name;
		
		private String password;
		
		private String email;
		
		private String PhoneNumber;
		
		private String address;

		


		
		Customer(String name, String pwd, String emailaddress, String num, String homeaddress)
		{
			this.setName(name);
			this.setPassword(pwd);
			this.setEmail(emailaddress);
			this.setPhoneNumber(num);
			this.setAddress(homeaddress);
		
		
		}
			Customer(){
			
		}
			
			
			public void RegisterUser()
		
			{
				System.out.println("Enter customer first and last name: ");
				String name = scanner.nextLine();
				if(this.isAlpha(name) == true)
				{
					
					setName(name);
					
				}
				
				System.out.println("Enter password: ");
				String pwd = scanner.nextLine();
				
				if(this.isAlpha(pwd) == true)
				{
					setPassword(pwd);
					
				}
				
				System.out.println("Enter email: ");
				String emailaddress = scanner.nextLine();
				if(this.isAlpha(emailaddress) == true)
				{
					setEmail(emailaddress);
					
				}
				
				System.out.println("Enter phone number: ");
				String num = scanner.nextLine();
				if(this.isNumeric(num) == true)
				{
					
					setPhoneNumber(num);
					
				}
				
				System.out.println("Enter home address: ");
				String homeaddress = scanner.nextLine();
				if(this.isAlpha(homeaddress) == true)
				{
					setAddress(homeaddress);
					
					
				}
			}
			
			public Boolean Login()
			{
				int i=0;
				String fileName = "username_password.txt";
				File file = new File(fileName);
				
				while (i==0)
				{
					System.out.println("Enter username: ");
					Name = scanner.nextLine();
					System.out.println("Enter password: ");
					password = scanner.nextLine();
					
					
					
			try(Scanner input = new Scanner(file)) {
				while(input.hasNextLine())
				{
					String[] line = input.nextLine().split(" ");
					if(line[0].equals(Name) && line[1].equals(password))
					{
						System.out.print("Welcome back! Login successful.\n");
	                    i =1;
	                    return true;
						
						
					}
					
				}
				 if  (i==0) System.out.println("Login has been failed! Try again.");
				 return false;
			}	catch (Exception e) {
	            System.out.println(e);} 
	   }
				return false;
					
					
	}
		
			
			private boolean isNumeric(String num) {
				// TODO Auto-generated method stub
				return false;
			}
			private boolean isAlpha(String name2) {
				// TODO Auto-generated method stub
				return false;
			}
			
			
			
			
			
			
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			
			
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			
			
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			
			
			public String getPhoneNumber() {
				return PhoneNumber;
			}
			public void setPhoneNumber(String phoneNumber) {
				PhoneNumber = phoneNumber;
			}
			
			
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public void intialize() {
				// TODO Auto-generated method stub
				
			}
			
			
			
			
	}
		
		