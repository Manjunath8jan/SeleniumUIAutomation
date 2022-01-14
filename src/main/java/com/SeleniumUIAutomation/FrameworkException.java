package com.SeleniumUIAutomation;

public class FrameworkException extends RuntimeException {
public String errorName = "Error";
	
	public FrameworkException(String errorDescription) {
		super(errorDescription);
	}
	
	public FrameworkException(String errorName, String errorDescription) {
		super(errorDescription);
		this.errorName = errorName;
	}
	
	public String getErrorName() {
		return errorName;
	}
}
