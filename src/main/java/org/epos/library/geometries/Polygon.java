package org.epos.library.geometries;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

public class Polygon extends Geometry{
	
	private ArrayList<Object> coordinates;
	
	private transient ArrayList<Double> startingPoint;
	private transient ArrayList<ArrayList<Double>> additionalPoints;
	private ArrayList<ArrayList<Double>> tempCoordinates;
	
	public Polygon() {
		super(GeometryType.POLYGON);
	}

	public void buildCoordinates() {
		assertNotNull(startingPoint);
		assertNotNull(additionalPoints);
		
		tempCoordinates = new ArrayList<>();
		tempCoordinates.add(startingPoint);
		tempCoordinates.addAll(additionalPoints);
		tempCoordinates.add(startingPoint);
		coordinates = new ArrayList<Object>();
		coordinates.add(tempCoordinates);
	}

	public ArrayList<Object> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ArrayList<Object> coordinates) {
		this.coordinates = coordinates;
	}

	public ArrayList<Double> getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(PointCoordinates startingPoint) {
		this.startingPoint = startingPoint.getCoords();
	}

	public ArrayList<Double> getNortheast() {
		return startingPoint;
	}

	public void addAdditionalPoint(PointCoordinates point) {
		if(additionalPoints==null) additionalPoints = new ArrayList<ArrayList<Double>>();
		additionalPoints.add(point.getCoords());
	}
	
}