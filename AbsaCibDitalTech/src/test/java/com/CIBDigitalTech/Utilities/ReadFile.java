package com.CIBDigitalTech.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadFile {
	
	Properties config;

	public void ReadConfig(){
		
		File file = new File("./Configurations/config.propertiesfile");
		try {
			FileInputStream fis = new FileInputStream(file);
			config = new Properties();
			config.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
			
		}
		
	public String getApplicationURL()
	{
		String url=config.getProperty("baseURL");
		return url;
	}
	
	}

