
public class Triangle extends Polygon {
	public Triangle(String theName, float theWidth, float theHeight) {
		super(theName, theWidth, theHeight);
		// this.polytype = KindofPolygon.POLY_TRIANG;
		// polytype = KindofPolygon.POLY_TRIANG; // also works
		setPolytype(KindofPolygon.POLY_TRIANG); // also works
	}
	
	public float calArea() {
		return (float)(0.5 * width * height);
	}
}
