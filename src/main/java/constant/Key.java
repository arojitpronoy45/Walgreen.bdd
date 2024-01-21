package constant;

public enum Key {

	URL("url"), PAGELOAD_WAIT("pageloadWait"), EXPLICIT_WAIT("explicitWait"), BROWSER("browser");
	
	private String key;
	
	//private Key(String a, String b) {}
	
	private Key(String key) {
		//this("a", "b");
		this.key = key;
	}
	
	public String getKeyValue() {
		return key;
	}
}