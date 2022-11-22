package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm {

    @BeforeAll
    static void beforeAll(){
        Configuration.holdBrowserOpen = true;
        //Configuration.browser="firefox";
        Configuration.baseUrl = "http://demoqa.com";
        Configuration.browserSize = "1920x1080";
        // Configuration.timeout= 10000;




    }

    @Test
    void fillFormTest() {
        String userName="Andrey";
        open("/text-box");


        $("#userName").setValue(userName);
        $("#userEmail").setValue("Andrey@mail.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Vladimirskaia");
        $("#submit").click();


        $("#output").shouldBe(Condition.visible);
        $("#output #name").shouldHave(text(userName));
        $("#output #email").shouldHave(text("Andrey@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow"));
        $("#output #permanentAddress").shouldHave(text("Vladimirskaia"));

    }
}
