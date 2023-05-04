package org.epos.library.feature;

import java.util.ArrayList;
import java.util.HashMap;

import org.epos.library.style.EposStyleItem;
import org.epos.library.style.EposStyleObject;

import com.google.gson.annotations.SerializedName;

public class FeaturesCollection {

	private final String type = "FeatureCollection";
	private ArrayList<Feature> features = new ArrayList<Feature>();
	
	@SerializedName(value = "@epos_style")
	private HashMap<String, EposStyleObject> styles;
	
	public void addFeature(Feature feature) {
		features.add(feature);
	}
	
	public void addStyleItem(EposStyleItem style) {
		if(styles == null) styles = new HashMap<String, EposStyleObject>();
		styles.put(style.getName(), style.getStyleName());
	}
	
	public String getType() {
		return type;
	}

	public ArrayList<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(ArrayList<Feature> features) {
		this.features = features;
	}
	
	public HashMap<String, EposStyleObject> getStyles() {
		return styles;
	}

	public void setStyles(HashMap<String, EposStyleObject> styles) {
		this.styles = styles;
	}
	
	
}
