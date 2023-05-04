package org.epos.library.geometries;

import java.util.ArrayList;
import java.util.List;

public class MultiPoint extends Geometry{
	
	private List<ArrayList<Double>> coordinates;
	
	public MultiPoint() {
		super(GeometryType.MULTI_POINT);
	}

	public List<ArrayList<Double>> getCoords() {
		return coordinates;
	}

	public void addCoordinates(PointCoordinates point) {
		if(coordinates==null) coordinates = new ArrayList<ArrayList<Double>>();
		coordinates.add(point.getCoords());
	}
}