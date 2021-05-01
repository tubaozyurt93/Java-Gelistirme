
public class InstructorManager extends UserManager{
	
	@Override
	public void logOut() {
		System.out.println("Öðrenci olarak sistemden çýkýþ yaptý.");
	}

	public void addTraining() {
		System.out.println("Yeni bir eðitim eklendi.");
	}
}
