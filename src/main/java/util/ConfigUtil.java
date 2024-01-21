package util;

import java.io.IOException;
import java.util.Properties;

import constant.FileName;
import constant.Key;

public class ConfigUtil {
	private Properties properties;

	public ConfigUtil(FileName fileName) {
		initProperties(fileName.getfileNameValue());
	}

	public void initProperties(String file) {
		if (properties == null) {
			properties = new Properties();

		}
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream(file));
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public String getPropertyValue(Key key) {
		return properties.getProperty(key.getKeyValue());

	}
}
