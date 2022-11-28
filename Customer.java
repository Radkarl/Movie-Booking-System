public class User
{
	



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
			
	}
		