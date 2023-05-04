package test;

import org.epos.library.enums.Anchor;
import org.epos.library.feature.Feature;
import org.epos.library.feature.FeaturesCollection;
import org.epos.library.feature.OverlayFeature;
import org.epos.library.geometries.GeometryType;
import org.epos.library.geometries.PointCoordinates;
import org.epos.library.geometries.Polygon;
import org.epos.library.objects.ImageOverlayLegend;
import org.epos.library.objects.ImageOverlayObject;
import org.epos.library.style.CharacterMarker;
import org.epos.library.style.EposStyleItem;
import org.epos.library.style.EposStyleObject;

import com.google.gson.Gson;

public class StylesTest {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		FeaturesCollection fc = new FeaturesCollection();
		
		Feature f = new Feature();
		
		EposStyleItem es = new EposStyleItem("station");
		es.setStyleName(new EposStyleObject());
		es.getStyleName().setLabel("thing");
		es.getStyleName().setMarker(new CharacterMarker("S", true, true, Anchor.C));
		
		f.addStyleProperty(es);
		f.addSimpleProperty("test", "test");
		
		Polygon geometry = new Polygon();
		geometry.setStartingPoint(new PointCoordinates(90.0, 50.0));
		geometry.addAdditionalPoint(new PointCoordinates(91.0, 50.0));
		geometry.addAdditionalPoint(new PointCoordinates(91.0, 50.0));
		geometry.addAdditionalPoint(new PointCoordinates(91.0, 50.0));
		geometry.buildCoordinates();
		f.setGeometry(geometry);
		
		fc.addStyleItem(es);
		fc.addFeature(f);
		
		OverlayFeature of = new OverlayFeature();
		of.addSimpleProperty("hoa", "cicho");
		
		ImageOverlayObject ioo = new ImageOverlayObject();
		ioo.setHref("blablas");
		ioo.setLat1(90.0);
		ioo.setLon1(90.0);
		ioo.setLat2(90.0);
		ioo.setLon2(90.0);
		ImageOverlayLegend iol = new ImageOverlayLegend();
		iol.setHref("dsiuyfhsysjyfg");
		ioo.setLegend(iol);
		of.setOverlayObject(ioo);
		
		fc.addFeature(of);
		
		System.out.println(gson.toJsonTree(fc));
	}

}
