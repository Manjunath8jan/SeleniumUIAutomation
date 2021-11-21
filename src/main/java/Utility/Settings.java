package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Settings {
	private static Properties properties = loadFromPropertiesFile();
	//private static Properties mobilePropertics = loadFromPropertiesFileForMobile();
	public static String relativePath;

	private Settings() {
		// To prevent external instantiation of this class
	}
	
	public static Properties getInstance() {
		return properties;
	}

	
	private static Properties loadFromPropertiesFile() {
		

		if (getRelativePath() == null) {
			throw new FrameworkException(
					"FrameworkParameters.relativePath is not set!");
		}

		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream(
					getRelativePath()
					+ Utils.getFileSeparator()
					+ "Global Settings.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FrameworkException(
					"FileNotFoundException while loading the Global Settings file");
		} catch (IOException e) {
			e.printStackTrace();
			throw new FrameworkException(
					"IOException while loading the Global Settings file");
		}

		return properties;
	}
	
	public static String getRelativePath() {
		return relativePath; 
	}
	
	public void SetRelativePath() {
		this.relativePath = System.getProperty("user.dir")+"\\src\\main\\resources";
	}
	
}
