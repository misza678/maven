package basic.form;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormPage;

import java.io.File;

public class PopFormTest extends TestBase {
    @Test
    public void shouldFillFormWithSuccess() {
        driver.get("http://seleniumui.moderntester.pl/form.php");
        File file = new File("src/main/resources/someFile.txt");

        FormPage formPage = new FormPage(driver);

        formPage.setFirstName("Jan")
        .setLastName("Kowalski")
        .setEmail("j.k23@wp.pl")
        .setAge("23")
        .selectRandomGender()
        .selectProfessions(1)
        .selectRandomkExperiences()
        .selectContinent("europe")
        .selectSeleniumCommand("browser-commands")
        .selectSeleniumCommand("switch-commands")
        .uploadFile(file)
        .submitForm();

        Assert.assertEquals(formPage.getValidationMsg(), "Form send with success");
    }
}