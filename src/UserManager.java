
public class UserManager {

	public void logIn(User user) {
	
		System.out.println("Giriþ yapýldý. "+user.getFirstName()+ "" + user.getLastName());
	}
	
	public void logOut() {
	
		System.out.println("Çýkýþ yapýldý.");
	}
}
