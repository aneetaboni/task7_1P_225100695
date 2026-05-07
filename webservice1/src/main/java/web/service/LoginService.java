package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Aneeta.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {

	    // Check null or empty inputs
	    if (username == null || password == null || dob == null) {
	        return false;
	    }

	    if (username.isEmpty() || password.isEmpty() || dob.isEmpty()) {
	        return false;
	    }

	    // Your credentials (use your details)
	    if (username.equals("aneeta") &&
	        password.equals("1234") &&
	        dob.equals("2001-03-19")) {
	        return true;
	    }

	    return false;
	}
	
	
}
