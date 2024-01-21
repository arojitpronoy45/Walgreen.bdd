package constant;

public enum FileName {

	CONFIG_PROPERTIES("config.properties");

	private String fileName;

	private FileName(String filename) {
		this.fileName = filename;

	}

	public String getfileNameValue() {
		return fileName;
	}
}

// config.properties will be imported from config.properites 'src/main/resources'