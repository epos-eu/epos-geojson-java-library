package org.epos.library.style;

public class EposStyleObject {

	private String label;

	private Marker marker;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Marker getMarker() {
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	@Override
	public String toString() {
		return "EposStyleObject [label=" + label + ", marker=" + marker + "]";
	}


}
