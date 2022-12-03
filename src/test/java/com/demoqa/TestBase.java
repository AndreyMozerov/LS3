package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

import java.util.Locale;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "http://demoqa.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
    Faker fakerEng = new Faker(new Locale("en-US"));
    Faker fakerRu = new Faker(new Locale("ru"));
    String firstName = fakerRu.name().firstName(),
            lastName = fakerRu.name().lastName(),
            phoneNumber = fakerRu.phoneNumber().subscriberNumber(10),
            email = fakerEng.internet().emailAddress(),
            gender = "Other",
            day = String.valueOf(fakerEng.number().numberBetween(1, 30)),
            month = "August",
            year = String.valueOf(fakerEng.number().numberBetween(1900, 2020)),
            jpg = "2.png",
            hobbies = "Sports",
            address = fakerRu.address().streetAddress()+", "+fakerRu.address().buildingNumber(),
            subjects = "Maths",
            state = "NCR",
            city = "Delhi";






}
