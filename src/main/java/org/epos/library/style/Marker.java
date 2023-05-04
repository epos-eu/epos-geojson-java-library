/*******************************************************************************
 * Copyright 2021 EPOS ERIC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.epos.library.style;

import org.epos.library.enums.Anchor;

public class Marker {
	
	private String character = null;
	private Boolean pin = true;
	private Boolean clustering = true;
	private Anchor anchor = Anchor.S;
	private String href = null;
	private String fontawesome_class = null;
	
	public Marker(String character, Boolean pin, Boolean clustering, Anchor anchor, String href, String fontawesome_class) {
		if(pin == null) pin = true;
		if(clustering==null) clustering = true;
		if(anchor==null) {
			if(pin==true) anchor = Anchor.S;
			else anchor = Anchor.C;
		}
		this.character = character;
		this.pin = pin;
		this.clustering = clustering;
		this.anchor = anchor;
		this.href = href;
		this.fontawesome_class = fontawesome_class;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}


	public boolean isPin() {
		return pin;
	}


	public void setPin(boolean pin) {
		this.pin = pin;
	}


	public boolean isClustering() {
		return clustering;
	}


	public void setClustering(boolean clustering) {
		this.clustering = clustering;
	}


	public Anchor getAnchor() {
		return anchor;
	}


	public void setAnchor(Anchor anchor) {
		this.anchor = anchor;
	}


	public String getHref() {
		return href;
	}


	public void setHref(String href) {
		this.href = href;
	}


	public String getFontawesome_class() {
		return fontawesome_class;
	}


	public void setFontawesome_class(String fontawesome_class) {
		this.fontawesome_class = fontawesome_class;
	}

	@Override
	public String toString() {
		return "Marker [character=" + character + ", pin=" + pin + ", clustering=" + clustering + ", anchor=" + anchor
				+ ", href=" + href + ", fontawesome_class=" + fontawesome_class + "]";
	}
	
	
	
}
