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
        String phoneNumber = "1234567890";
        String Email = "Andrey@mail.ru";
        String Gender = "Other";
        String Hobbies = "Sports";
        String Address = "Moscow";

        registrationPage.openPage();
        registrationPage.setFirstName(firstName);
        registrationPage.setLastName(lastName);
        registrationPage.setUserNumber(phoneNumber);
        registrationPage.setUserEmail(Email);
        registrationPage.setGender(Gender);
        registrationPage.setBirthDate("30", "August", "2008");
        registrationPage.setHobbies(Hobbies);
        registrationPage.setSubjects("Maths");
        registrationPage.setAddress(Address);




        //$("#currentAddress").setValue(userAddress);
        //$("#subjectsInput").setValue("Maths").pressEnter();
        //$("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/img/2.png"));
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();


        registrationPage.setVerifyModalAppears();
        registrationPage.setVerifyResult("Student Name",firstName+lastName);
        registrationPage.setVerifyResult("Student Email",Email);
        registrationPage.setVerifyResult("Gender",Gender);
        registrationPage.setVerifyResult("Mobile",phoneNumber);
        registrationPage.setVerifyResult("Date of Birth","30 August,2008");
        registrationPage.setVerifyResult("Subjects","Maths");
        registrationPage.setVerifyResult("Hobbies",Hobbies);
        registrationPage.setVerifyResult("Address",Address);


        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text("Andrey@mail.ru"), text("1234567890"), text("Moscow"),
                text("Maths"), text("Sports"), text("Other"), text("NCR"),
                text("Delhi"));


    }
}
