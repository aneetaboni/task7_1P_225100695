package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginServiceUnitTest {
	
    @Test
    public void testValidLogin() {
        assertTrue(LoginService.login("aneeta", "1234", "2001-03-19"));
    }

    @Test
    public void testWrongUsername() {
        assertFalse(LoginService.login("wrong", "1234", "2001-03-19"));
    }

    @Test
    public void testWrongPassword() {
        assertFalse(LoginService.login("aneeta", "wrong", "2001-03-19"));
    }

    @Test
    public void testWrongDOB() {
        assertFalse(LoginService.login("aneeta", "1234", "2000-01-01"));
    }

    @Test
    public void testEmptyInputs() {
        assertFalse(LoginService.login("", "", ""));
    }

    @Test
    public void testEmptyUsernameOnly() {
        assertFalse(LoginService.login("", "1234", "2001-03-19"));
    }

    @Test
    public void testEmptyPasswordOnly() {
        assertFalse(LoginService.login("aneeta", "", "2001-03-19"));
    }

    @Test
    public void testEmptyDOBOnly() {
        assertFalse(LoginService.login("aneeta", "1234", ""));
    }

    @Test
    public void testNullUsername() {
        assertFalse(LoginService.login(null, "1234", "2001-03-19"));
    }

    @Test
    public void testNullPassword() {
        assertFalse(LoginService.login("aneeta", null, "2001-03-19"));
    }

    @Test
    public void testNullDOB() {
        assertFalse(LoginService.login("aneeta", "1234", null));
    }

    @Test
    public void testInvalidDOBFormat() {
        assertFalse(LoginService.login("aneeta", "1234", "19-03-2001"));
    }

    @Test
    public void testCaseSensitiveUsername() {
        assertFalse(LoginService.login("Aneeta", "1234", "2001-03-19"));
    }

    @Test
    public void testCaseSensitivePassword() {
        assertFalse(LoginService.login("aneeta", "1234 ", "2001-03-19"));
    }
}