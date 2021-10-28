package Address;

public class CreateContact {
  
	public static void main(String args[]) {
		 Contact person = new Contact();
		
		person.setFirstname("Shridhar");
		person.setLastname("Kolhatkar");
		person.setCity("nanded");
		person.setEmail("shri@gmail.com");
		person.setAddress("wagholi Pune");
		person.setState("Maharashtra");
		person.setZip(412207);
		person.setPhonenumber(1234567890); 
		
		System.out.println(person);
	 }
}


