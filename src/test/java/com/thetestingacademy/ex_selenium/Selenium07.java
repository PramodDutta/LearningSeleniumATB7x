package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium07 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();


    }
}
