package com.sgtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo 
{
	public static WebDriver oBorwser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateURL();
		closeApplication();
	}
    private static void launchBrowser()
    {
    	try
    	{
    		oBorwser=new EdgeDriver();
    		
    		
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();    	
    	}
    }
    private static void navigateURL()
    {
    	try
    	{
    		oBorwser.get("http://localhost/login.do");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
   private static void closeApplication()
   {
	   try
	   {
		   oBorwser.quit();
	   }catch(Exception e)
	   {
		   
	   }
   }
}
