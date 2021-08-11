package com.StepDef;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFile {
	WebDriver driver;
	FileInputStream fis;
	Properties ps;
	public BaseFile() {
		 System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		  driver = new ChromeDriver();
		  
		  try {
				ps = new Properties();
				FileInputStream fis = new FileInputStream("./Config.properties");
				ps.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}  
			//return ps.getProperty(Value);
	}


