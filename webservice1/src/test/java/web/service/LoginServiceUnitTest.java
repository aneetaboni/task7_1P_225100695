package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginServiceUnitTest {

	@Test
	public void testValidLogin() {
	    assertFalse(LoginService.login("aneeta", "1234", "2001-03-19"));
	}
}