package com.demoqa;

import org.junit.jupiter.api.Test;
import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPageObjectsTest extends TestBase {

    @Test
    void fillFormTest() {
        String firstName = "Andrey";
        String lastName = "Mozer";
        String foneNumber = "1234567890";
        String Email = "Andrey@mail.ru";

        registrationPage.openPage();
        registrationPage.setFirstName(firstName);
        registrationPage.setLastName(lastName);
        registrationPage.setUserNumber(foneNumber);
        registrationPage.setUserEmail(Email);
        registrationPage.setGender("Other");
        registrationPage.setBirthDate("30", "August", "2008");




        $("#currentAddress").setValue("Moscow");
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/img/2.png"));
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();


        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName), text(lastName), text("Andrey@mail.ru"), text("1234567890"), text("Moscow"), text("Maths"), text("Sports"), text("Other"), text("NCR"), text("Delhi"));


    }
}
