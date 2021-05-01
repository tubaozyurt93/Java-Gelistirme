
public class StudentManager extends UserManager{
	
  @Override
  public void logOut()
  {
	  System.out.println("Öðrenci olarak sistemden çýkýþ yaptý.");
  }
  
  public void uploadHomework()
  {
	  System.out.println("Yüklendi.");
  }
	
}
