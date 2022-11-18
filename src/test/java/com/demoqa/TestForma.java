package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForma {

    @BeforeAll
    static void configure(){
        Configuration.baseUrl="https://demoqa.com/";
        Configuration.timeout= 1000;
        Configuration.browser="chrome";
        Configuration.browserSize="1920*1080";

    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#UserName").setValue("Andrey");
        $("#UserEmail").setValue("Andrey@mail.ru");
        $("#currrentAddress").setValue("A");
        $("#permanentAddress").setValue("S");
        $("#submit").click();


        $("#submit").click();
    }
}
