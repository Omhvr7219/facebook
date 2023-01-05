package login_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library_files.CLASS_BASE;
import library_files.utility_class;
import login.login_pom_1;

public class login_test_class extends CLASS_BASE {
	login_pom_1 o1;
	int TCID;

	@BeforeClass
	public void openfb() {
		open_fb();

		o1 = new login_pom_1(driver);
	}

	@BeforeMethod
	public void enter_details() throws EncryptedDocumentException, IOException {
		String UNMm = utility_class.getTD(0, 0);
		o1.login_pom_1_enter_UN(UNMm);
		String PWRD = utility_class.getTD(0, 1);
		o1.login_pom_1_enter_PWD(PWRD);

	}
@Test
	public void submit() {
		o1.login_pom_1_click_sgnbtn();
	}

}
