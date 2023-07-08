package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.Constants;

public class CommonUtils {

	public static void loadProperties() {
		FileReader reader = null;
		try {
			reader = new FileReader("config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties properties = new Properties();
		try {
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Constants.url = properties.getProperty("url");
		Constants.username = properties.getProperty("username");
		Constants.password = properties.getProperty("password");
		Constants.browser = properties.getProperty("browser");

	}

}
