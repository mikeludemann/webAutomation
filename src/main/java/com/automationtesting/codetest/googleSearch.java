/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automationtesting.codetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author mikeludemann
 */
public class googleSearch {
    
    WebDriver driver;
    
    public googleSearch(WebDriver driver){
        
        this.driver = driver;
        
    }
    
    public void goToGoogle(){
        
        this.driver.get("https://google.de");
        
        System.out.println(this.driver.getTitle());
        
    }
    
    public void search(String text){
        
        WebElement textfield = this.driver.findElement(By.name("q"));
        textfield.sendKeys(text);
        
        WebElement button = this.driver.findElement(By.name("btnK"));
        button.click();
        
    }
    
}
