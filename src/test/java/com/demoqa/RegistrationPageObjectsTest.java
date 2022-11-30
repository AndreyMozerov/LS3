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
        String firstName = "Andrey",
               lastName = "Mozer",
               phoneNumber = "1234567890",
               email = "Andrey@mail.ru",
               gender = "Other",
               day = "30",
               month = "August",
               year = "2000",
               jpg = "src/test/resources/img/2.png",
               hobbies = "Sports",
               address = "Moscow",
               subjects = "Maths",
               state = "NCR",
               city = "Delhi";

        registrationPage.openPage();
        registrationPage.setFirstName(firstName);
        registrationPage.setLastName(lastName);
        registrationPage.setUserNumber(phoneNumber);
        registrationPage.setUserEmail(email);
        registrationPage.setGender(gender);
        registrationPage.setBirthDate(day, month, year);
        registrationPage.setHobbies(hobbies);
        registrationPage.setSubjects(subjects);
        registrationPage.setAddress(address);
        registrationPage.setJpg(jpg);
        registrationPage.setState(state);
        registrationPage.setCity(city);
        registrationPage.setSubmit();

        registrationPage.setVerifyModalAppears();
        registrationPage.setVerifyResult("Student Name",firstName+lastName);
        registrationPage.setVerifyResult("Student Email",email);
        registrationPage.setVerifyResult("Gender",gender);
        registrationPage.setVerifyResult("Mobile",phoneNumber);
        registrationPage.setVerifyResult("Date of Birth",day + " " + month + "," + year);
        registrationPage.setVerifyResult("Subjects",subjects);
        registrationPage.setVerifyResult("Hobbies",hobbies);
        registrationPage.setVerifyResult("Picture",jpg);
        registrationPage.setVerifyResult("Address",address);
        registrationPage.setVerifyResult("State and City",state + " " + city);
    }
}
