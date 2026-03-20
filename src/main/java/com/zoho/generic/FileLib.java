package com.zoho.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

	public String getProData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Sai Kiran\\eclipse-workspace\\ZOHOCMR\\src\\test\\resources\\data\\commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	
	
}
