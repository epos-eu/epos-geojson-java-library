package org.epos.library.feature;

import org.epos.library.objects.ImageOverlayObject;
import com.google.gson.annotations.SerializedName;

public class OverlayFeature extends Feature {
	
	@SerializedName(value = "@epos_image_overlay")
	private ImageOverlayObject overlayObject;
	
	
	public OverlayFeature() {
		super.setGeometry(null);
	}


	public ImageOverlayObject getOverlayObject() {
		return overlayObject;
	}


	public void setOverlayObject(ImageOverlayObject styles) {
		this.overlayObject = styles;
	}
	
	

}
