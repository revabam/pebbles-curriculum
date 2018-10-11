package com.revature.models;

import java.util.Date;

/**
 * This stores strings from exceptions
 * @author Beck Larson | Spark-1806-Jun-2018-USF | Steven Kelsey
 */
public class ExceptionObject {
	
	  private String message;
	  private String exToString;
	  private String excptionClass;

	  public ExceptionObject() {
		super();
	}

	public ExceptionObject(String message, String exToString, String exceptionClass) {
	    super();
	    this.message = message;
	    this.exToString = exToString;
	    this.excptionClass = exceptionClass;
	  }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExToString() {
		return exToString;
	}

	public void setExToString(String exToString) {
		this.exToString = exToString;
	}

	public String getExcptionClass() {
		return excptionClass;
	}

	public void setExcptionClass(String excptionClass) {
		this.excptionClass = excptionClass;
	}
	
}	
