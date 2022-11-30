import java.util.Scanner;



//Initializing User
public class User
{
	

	Scanner scanner = new Scanner(System.in);

		private String Name;
		
		private String password;
		
		private String email;
		
		private String PhoneNumber;
		
		private String address;

		


		
		User(String name, String pwd, String emailaddress, String num, String homeaddress)
		{
			this.setName(name);
			this.setPassword(pwd);
			this.setEmail(emailaddress);
			this.setPhoneNumber(num);
			this.setAddress(homeaddress);
		
		
		}
			User(){
			
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
		
		