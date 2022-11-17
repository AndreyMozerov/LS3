package com.demoqa;

import org.junit.jupiter.api.*;

public class ExampleTestJunit5 {

    @BeforeAll
    static void configure(){
        System.out.println("H");
    }

    @AfterAll
     static void tearDown(){
        System.out.println("D");
    }

    @BeforeEach
    void beforeTest(){
        System.out.println("c");
    }
    @AfterEach
    void afterTest(){
        System.out.println("v");
    }

    @Test
    void test() {
        Assertions.assertTrue(3>2);
    }



}
