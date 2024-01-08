package com.metlife.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1launch
{
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("htpps://google.com");

        WebDriver driver1 = new ChromeDriver();

        driver1.get("htpps://facebook.com");

        String actualTitle= obj1.getTitle();
        String actualTitle= obj2.getTitle();


    }

}
