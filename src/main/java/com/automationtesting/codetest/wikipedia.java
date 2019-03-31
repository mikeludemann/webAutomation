/*
 * Copyright 2019 My Work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.automationtesting.codetest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author mikeludemann
 */
public class wikipedia {
    
    WebDriver driver;
    
    public wikipedia(WebDriver driver){
        
        this.driver = driver;
        
    }
    
    
    
    public void goToWikipedia(){
        
        this.driver.get("https://de.wikipedia.org/");
        
        System.out.println(this.driver.getTitle());
        
    }
    
    public void search(String text){
        
        WebElement textfield = this.driver.findElement(By.name("search"));
        textfield.sendKeys(text);
        
        WebElement button = this.driver.findElement(By.name("go"));
        button.click();
        
    }
    
    public void getMainListOfArticle(){
        
        List<WebElement> historyList = this.driver.findElements(By.xpath("//[@class='mw-parser-output']/h2/span[0]"));
        
        for (WebElement elm:historyList) {
            
            System.out.println("The name of the part in this list is: " + elm.getText());
            
        }
        
    }
    
}
