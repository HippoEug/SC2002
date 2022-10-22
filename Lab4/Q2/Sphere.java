
public class Sphere extends Circle implements _3d{
	public Sphere(int radius) {
		super(radius);
	}
	
	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(super.getRadius(), 3);
	}

	public double getSurfaceArea() {
		return (4*Math.PI*super.getRadius()*super.getRadius());
	}
}
