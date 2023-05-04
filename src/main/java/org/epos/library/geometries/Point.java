package org.epos.library.geometries;

import java.util.ArrayList;

public class Point extends Geometry{
	
	private ArrayList<Double> coordinates;
	
	public Point() {
		super(GeometryType.POINT);
	}

	public ArrayList<Double> getCoords() {
		return coordinates;
	}

	public void setCoordinates(PointCoordinates point) {
		if(coordinates==null) coordinates = new ArrayList<Double>();
		coordinates.addAll(point.getCoords());
	}
}