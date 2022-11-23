package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "http://demoqa.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        }

    @Test
    void fillFormTest() {
        String firstName="Andrey";
        String lastName="Andrey";
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userNumber").setValue("123456789");
        $("#userEmail").setValue("Andrey@mail.ru");
        $("#currentAddress").setValue("Moscow");
       // $("#permanentAddress").setValue("Vladimirskaia");
        $("#gender-radio-1").parent().click();



        $("#submit").click();


        $("#output").shouldBe(Condition.visible);
        $("#output #name").shouldHave(text(firstName));
        $("#output #email").shouldHave(text("Andrey@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow"));
        $("#output #permanentAddress").shouldHave(text("Vladimirskaia"));

    }
}
