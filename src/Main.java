
public class Main {

	public static void main(String[] args) {
		
		User user1=new Student();
		user1.setId(1);
		user1.setFirstName("Tuba");
		user1.setLastName("Özyurt");
		user1.setEmail("tuba.ozyurt93@gmail.com");
		
		UserManager studentManager=new StudentManager();
		studentManager.logIn(user1);
		studentManager.logOut();

	}

}
