package TestNGannotations;

import org.testng.annotations.*;

public class Exampletestmethod {




        @Test
        public void testmethod1(){
            System.out.println("Test method 1");
        }


        @Test
        public void testmethod2(){
            System.out.println("Test method 2");
        }


        @BeforeMethod
        public void BeforeMethod(){

            System.out.println("BeforeMethod");
        }

        @AfterMethod
        public void AfterMethod(){

            System.out.println("AfterMethod");
        }







}
