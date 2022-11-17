package com.demoqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class ExampleTestJunit5 {

    @BeforeAll
    static void configure(){
        System.out.println("H");
    }

    @AfterAll
     static void tearDown(){
        System.out.println("D");
    }

    @Test
    void test() {
        Assertions.assertTrue(3>2);
    }



}
