package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PortalLogin {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://portal.aait.edu.et/");

        System.out.println("Successfully opened the website localhost");

        driver.findElement(By.id("UserName")).sendKeys("ATE/5351/09");
        driver.findElement(By.id("Password")).sendKeys("8446");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div[2]/div[2]/div[2]/form/div[4]/div/button")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"ml2\"]")).click();
       // driver.findElement(By.id("m12")).click();

        String output = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
       // File DestFile= new File("Desktop/grade.doc");


        List<String> lines = Arrays.asList(output);
        Path file = Paths.get("grade.doc");
        Files.write(file, lines, StandardCharsets.UTF_8);
        // FileUtils.writeStringToFile(DestFile,output);
        //FileUtils.writeStringToFile(DestFile, output);
        System.out.println("success");


    }
}
