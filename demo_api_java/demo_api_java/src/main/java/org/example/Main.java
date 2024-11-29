package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Démarrer les webdriver
        WebDriver driver = new ChromeDriver();

        //Naviguer vers une page
        driver.get("https://google.com");

        //Trouver le champ recherche
        WebElement searchBox = driver.findElement(By.name("q"));

        //Entrer un texte dans le champ de recherche
        searchBox.sendKeys("Télécharger chromedriver");

        //Valider le champ
        searchBox.submit();

        //Remplacer par wait
        Thread.sleep(2000);

        WebElement result = driver.findElement(By.id("search"));

        System.out.println("Résultats : " + result.getText());
    }
}