package org.epos.library.geometries;

import java.util.ArrayList;

@Deprecated
public class MultiLineString extends Geometry{
	
	private ArrayList<ArrayList<Double>> coordinates;
	
	public MultiLineString() {
		super(GeometryType.MULTI_LINE_STRING);
	}

	public ArrayList<ArrayList<Double>> getCoords() {
		return coordinates;
	}

	public void addCoordinates(PointCoordinates point) {
		if(coordinates==null) coordinates = new ArrayList<ArrayList<Double>>();
		coordinates.add(point.getCoords());
	}
}