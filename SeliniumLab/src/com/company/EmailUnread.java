package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailUnread {
    public static void main(String[] args)  throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        System.out.println("Successfully opened the website localhost");
;

        driver.findElement(By.id("identifierId")).sendKeys("kebedeyididya1@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("kovadk@1996@lohan");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
        Thread.sleep(2000);
        String number=driver.findElement(By.xpath("//*[@id=\":je\"]/div/div[2]/div")).getText();

        System.out.println("THe number of unread emails = "+number);

    }
}
