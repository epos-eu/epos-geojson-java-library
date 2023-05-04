package org.epos.library.geometries;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

public class PointCoordinates {

	private ArrayList<Double> coords;

	/**
	 * Exactly in this order
	 * 
	 * @param longitude
	 * @param latitude
	 */
	public PointCoordinates(Double longitude, Double latitude) {
		assertNotNull(latitude);
		assertNotNull(longitude);
		coords = new ArrayList<>();
		coords.add(longitude);
		coords.add(latitude);
	}
	
	
	public ArrayList<Double> getCoords() {
		return coords;
	}

	public void setCoords(ArrayList<Double> coords) {
		this.coords = coords;
	}

	
}
