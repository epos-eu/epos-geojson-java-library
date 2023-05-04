package org.epos.library.style;

import org.epos.library.enums.Anchor;

public class CharacterMarker extends Marker{

	public CharacterMarker(String character, Boolean pin, Boolean clustering, Anchor anchor) {
		super(character, pin, clustering, anchor, null, null);
	}
	
}
