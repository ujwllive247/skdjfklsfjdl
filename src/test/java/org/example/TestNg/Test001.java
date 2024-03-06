package org.example.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test001 {

    @BeforeMethod
    void demo4(){
        System.out.println("Before Method");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void demo6 (){
        System.out.println("After Method");
    }
}
