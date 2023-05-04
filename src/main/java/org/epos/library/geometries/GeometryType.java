package org.epos.library.geometries;

public enum GeometryType {
	
    GEOMETRY_COLLECTION("GeometryCollection"),
    LINE_STRING("LineString"),
    MULTI_LINE_STRING("MultiLineString"),
    MULTI_POINT("MultiPoint"),
    MULTI_POLYGON("MultiPolygon"),
    POINT("Point"),
    POLYGON("Polygon");

    public String getTypeName() {
        return typeName;
    }

    private final String typeName;

    GeometryType(final String typeName) {
        this.typeName = typeName;
    }
}