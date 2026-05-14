// package web.service;

// import org.junit.Assert;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// public class LoginServiceTest {

//     private static final String CHROME_DRIVER =
//             "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

//     private static final String LOGIN_PAGE =
//             "http://127.0.0.1:8082/login";

//     private void sleep(long sec) {
//         try {
//             Thread.sleep(sec * 1000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }

//     private void runLoginTest(String username, String password, String dob, String expectedTitle) {
//         System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);

//         WebDriver driver = new ChromeDriver();

//         try {
//             driver.navigate().to(LOGIN_PAGE);
//             sleep(2);

//             driver.findElement(By.id("username")).clear();
//             driver.findElement(By.id("username")).sendKeys(username);

//             driver.findElement(By.id("passwd")).clear();
//             driver.findElement(By.id("passwd")).sendKeys(password);

//             ((JavascriptExecutor) driver)
//                     .executeScript("document.getElementById('dob').value='" + dob + "';");

//             driver.findElement(By.cssSelector("[type=submit]")).click();

//             sleep(3);

//             String title = driver.getTitle();
//             System.out.println("Expected: " + expectedTitle + ", Actual: " + title);

//             Assert.assertEquals(expectedTitle, title);

//         } finally {
//             driver.quit();
//         }
//     }

//     @Test
//     public void testLoginSuccess() {
//         runLoginTest("aneeta", "1234", "2001-03-19", "success");
//     }

//     @Test
//     public void testLoginFailWrongUsername() {
//         runLoginTest("wrong", "1234", "2001-03-19", "fail");
//     }

//     @Test
//     public void testLoginFailWrongPassword() {
//         runLoginTest("aneeta", "wrong", "2001-03-19", "fail");
//     }

//     @Test
//     public void testLoginFailWrongDOB() {
//         runLoginTest("aneeta", "1234", "2000-01-01", "fail");
//     }

//     @Test
//     public void testLoginFailEmptyUsername() {
//         runLoginTest("", "1234", "2001-03-19", "fail");
//     }

//     @Test
//     public void testLoginFailEmptyPassword() {
//         runLoginTest("aneeta", "", "2001-03-19", "fail");
//     }

//     @Test
//     public void testLoginFailEmptyDOB() {
//         runLoginTest("aneeta", "1234", "", "fail");
//     }

//     @Test
//     public void testLoginFailAllEmpty() {
//         runLoginTest("", "", "", "fail");
//     }
// }
