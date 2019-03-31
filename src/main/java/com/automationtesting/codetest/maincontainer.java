/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automationtesting.codetest;

import jdk.nashorn.internal.codegen.CompilerConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author mikeludemann
 */
public class maincontainer {
    
    /* WebDriver initiate */
    WebDriver driver = new FirefoxDriver();
    
    public maincontainer(WebDriver driver){
        this.driver = driver;
    }
    
    public void allTest(){
        
        /* Class Instances */        
        googleSearch newSearch;
        newSearch = new googleSearch(this.driver);
        
        wikipedia articleSearch; 
        articleSearch = new wikipedia(this.driver);
        
        /* Google Search */
        
        newSearch.goToGoogle();
        newSearch.search("News");
        
        /* Wikipedia */
        
        articleSearch.goToWikipedia();
        articleSearch.search("Super Mario");
        articleSearch.getMainListOfArticle();
        
        /* Finish the tests with closing of the WebDriver */
        finish(this.driver);
        
    }
    
    public void finish(WebDriver driver){
        this.driver.quit();
    }
    
}
