package com.swiggy.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class will be used for FileHandling
 * 
 * @author SCSE15
 *
 */
public class FileUtility {
	/**
	 * This method will be used to read the data from property file
	 * 
	 * @param key
	 * @author Aman
	 * @return value
	 * @throws IOException
	 */
	public String readCommonData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/swiggydata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
