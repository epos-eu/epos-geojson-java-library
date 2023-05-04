package org.epos.library.geometries;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

@Deprecated
public class LineString extends Geometry{
	
	private ArrayList<Double> coordinates;
	
	public LineString() {
		super(GeometryType.LINE_STRING);
	}

	public ArrayList<Double> getCoords() {
		assertTrue(coordinates.size()>=2);
		return coordinates;
	}

	public void addCoordinates(PointCoordinates point) {
		if(coordinates==null) coordinates = new ArrayList<Double>();
		coordinates.addAll(point.getCoords());
	}
}