package org.epos.library.feature;

import java.util.HashMap;

import org.epos.library.geometries.Geometry;
import org.epos.library.propertiestypes.Property;
import org.epos.library.style.EposStyleItem;

public class Feature {
	
	private final String type = "Feature";
	
	private HashMap<String, Object> properties = new HashMap<String, Object>();
	
	private Geometry geometry;
	
	public void addSimpleProperty(String key, Object value) {
		properties.put(key, value);
	}
	
	public void addPropertyFromPropertyObject(Property property) {
		properties.put(property.getKey(), property.getValue());
	}
	
	public void addStyleProperty(EposStyleItem style) {
		properties.put("@epos_type", style.getName());
	}

	public String getType() {
		return type;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

}
