package org.epos.library.objects;

public class LinkObject {

	private String href;
	private String label;
	private String type;
	private String group;
	private Boolean authenticatedDownload;
	
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getAuthenticatedDownload() {
		return authenticatedDownload;
	}
	public void setAuthenticatedDownload(Boolean authenticatedDownload) {
		this.authenticatedDownload = authenticatedDownload;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	
}
