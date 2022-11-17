package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestForma {

    @BeforeAll
    static void configure(){
        Configuration.baseUrl="https://demoqa.com";
        Configuration.timeout= 10000;
        Configuration.browserSize="1920*1080";
        Configuration.browser="chrome";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
    }
}
