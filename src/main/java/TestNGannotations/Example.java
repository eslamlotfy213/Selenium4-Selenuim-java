package TestNGannotations;

import org.testng.annotations.*;

public class Example {




        @Test
        public void testmethod1(){

            System.out.println("Test method");
        }

        @BeforeTest
        public void BeforeTest(){

            System.out.println("BeforeTest");
        }
        @AfterTest
        public void AfterTest(){

            System.out.println("AfterTest");
        }



        @BeforeMethod
        public void BeforeMethod(){

            System.out.println("BeforeMethod");
        }

        @AfterMethod
        public void AfterMethod(){

            System.out.println("AfterMethod");
        }


        @AfterClass
        public void AfterClass(){

            System.out.println("AfterClass");
        }

        @BeforeClass
        public void BeforeClass(){

            System.out.println("BeforeClass");
        }


        @AfterSuite
        public void AfterSuite(){

            System.out.println("AfterSuite");
        }

        @BeforeSuite
        public void BeforeSuite(){

            System.out.println("BeforeSuite");
        }









}
