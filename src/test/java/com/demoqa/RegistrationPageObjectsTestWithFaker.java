package com.demoqa;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class RegistrationPageObjectsTestWithFaker extends TestBase {

    @Test
    void fillFormTest() {

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
        registrationPage.setVerifyResult("Student Name", firstName + " " + lastName);
        registrationPage.setVerifyResult("Student Email", email);
        registrationPage.setVerifyResult("Gender", gender);
        registrationPage.setVerifyResult("Mobile", phoneNumber);
        registrationPage.setVerifyResult("Date of Birth", day + " " + month + "," + year);
        registrationPage.setVerifyResult("Subjects", subjects);
        registrationPage.setVerifyResult("Hobbies", hobbies);
        registrationPage.setVerifyResult("Picture", jpg);
        registrationPage.setVerifyResult("Address", address);
        registrationPage.setVerifyResult("State and City", state + " " + city);
    }
}
