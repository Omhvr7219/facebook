package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pom_1 {
	@FindBy(xpath = "//input[@id='email']")
	private WebElement UN;
	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement PWD;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement SIGNIN;

	public login_pom_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login_pom_1_enter_UN(String UNM) {
		UN.sendKeys(UNM);
	}

	public void login_pom_1_enter_PWD(String PWRD) {
		PWD.sendKeys(PWRD);
	}

	public void login_pom_1_click_sgnbtn() {
		SIGNIN.click();
	}
}
