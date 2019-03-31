/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automationtesting.codetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author mikeludemann
 */
public class maintest {
    
    public static void main(String [] args){
        
        WebDriver driver = null;
        
        maincontainer executeTest = new maincontainer(driver);
        executeTest.allTest();
        
    }
    
}
