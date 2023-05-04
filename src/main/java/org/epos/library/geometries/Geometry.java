package org.epos.library.geometries;

public abstract class Geometry {

    private final String type;
    
    protected Geometry() {
        this(null);
    }

    protected Geometry(final GeometryType type) {
        this.type = type.getTypeName();
    }

    public GeometryType getType() {
    	return GeometryType.valueOf(type);
    };
}