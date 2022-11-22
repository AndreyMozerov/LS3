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

       Configuration.baseUrl = "https://demoqa.com";
       // Configuration.timeout= 10000;
       // Configuration.browser="chrome";

       Configuration.browserSize = "1910*1080";

    }

    @Test
    void fillFormTest() {
        String userName="Andrey";
        open("/text-box");
        $("#userName").setValue(userName);
        $("#userEmail").setValue("Andrey@mail.ru");
        $("#currrentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Vladimirskaia");
        $("#submit").click();


        $("#output").shouldBe(Condition.visible);
        $("#output #name").shouldHave(text(userName));
        $("#output #email").shouldHave(text("Andrey@mail.ru"));

    }
}
