package org.epos.library.propertiestypes;

import java.util.List;

public class PropertyMapKeys extends Property {
	
	public PropertyMapKeys(List<Object> value) {
		super.setKey("@epos_map_keys");
		super.setValue(value);
	}

}
