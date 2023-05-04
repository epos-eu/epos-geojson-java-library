package org.epos.library.propertiestypes;


import java.util.ArrayList;

import org.epos.library.objects.LinkObject;

public class PropertyLinks extends Property {
	
	public PropertyLinks(ArrayList<LinkObject> value) {
		super.setKey("@epos_links");
		super.setValue(value);
	}

}
