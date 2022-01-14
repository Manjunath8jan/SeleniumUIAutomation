package com.SeleniumUIAutomation;

public enum Browsers {
	CHROME("chrome"), FIREFOX("firefox"), GHOST_DRIVER("phantomjs"), CHROME_HEADLESS("chrome_headless");
	
	private String value;

	Browsers(String value) {
		this.value = value;
	}

	public String getvalue() {
		return value;
	}
}
