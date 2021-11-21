package Utility;

public enum Browser {
	CHROME("chrome"), FIREFOX("firefox"), GHOST_DRIVER("phantomjs"), CHROME_HEADLESS("chrome_headless");

	private String value;

	Browser(String value) {
		this.value = value;
	}

	public String getvalue() {
		return value;
	}
}
