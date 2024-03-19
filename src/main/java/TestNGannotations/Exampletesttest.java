package TestNGannotations;

import org.testng.annotations.*;

public class Exampletesttest {




        @Test
        public void testmethod1(){
            System.out.println("Test method 1");
        }

        @Test
       public void testmethod2(){
        System.out.println("Test method 2");
    }


        @BeforeTest
        public void BeforeTest(){

            System.out.println("@BeforeTest");
        }

        @AfterTest
        public void AfterTest(){

            System.out.println("@AfterTest");
        }







}
