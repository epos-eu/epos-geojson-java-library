package org.epos.library.propertiestypes;

public abstract class Property {
	
	private String key = null;
	private Object value = null;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	

}
