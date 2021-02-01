package superKeyword;

public class LoginPage extends Page{

	int loadTime = 20;
	
	void loading() {
		System.out.println("login page load time: " +loadTime);
		System.out.println("page load time: " +super.loadTime);
	}
	
	
}
