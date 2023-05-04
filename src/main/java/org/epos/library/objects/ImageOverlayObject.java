package org.epos.library.objects;

public class ImageOverlayObject {
	
	private String href;
	private ImageOverlayLegend legend;
	private transient Double lat1;
	private transient Double lon1;
	private transient Double lat2;
	private transient Double lon2;
	private Double[] bbox = new Double[4];
	
	
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public Double getLat1() {
		return lat1;
	}
	public void setLat1(Double lat1) {
		this.lat1 = lat1;
		this.bbox[0] = lat1;
	}
	public Double getLon1() {
		return lon1;
	}
	public void setLon1(Double lon1) {
		this.lon1 = lon1;
		this.bbox[1] = lon1;
	}
	public Double getLat2() {
		return lat2;
	}
	public void setLat2(Double lat2) {
		this.lat2 = lat2;
		this.bbox[2] = lat2;
	}
	public Double getLon2() {
		return lon2;
	}
	public void setLon2(Double lon2) {
		this.lon2 = lon2;
		this.bbox[3] = lon2;
	}
	public Double[] getBbox() {
		return bbox;
	}
	public void setBbox(Double[] bbox) {
		this.bbox = bbox;
	}
	public ImageOverlayLegend getLegend() {
		return legend;
	}
	public void setLegend(ImageOverlayLegend legend) {
		this.legend = legend;
	}
	
	

}
