package org.epos.library.propertiestypes;

import java.util.List;

public class PropertyDataKeys extends Property {
	
	public PropertyDataKeys(List<Object> value) {
		super.setKey("@epos_data_keys");
		super.setValue(value);
	}

}
