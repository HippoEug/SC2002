
public class Cuboid extends Rectangle implements _3d {
	private int height;
	
	public Cuboid(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}
	
	public double getVolume() {
		return super.getLength() * super.getWidth() * this.height;
	}

	public double getSurfaceArea() {
		return (2*super.getLength()*super.getWidth() + 2*super.getLength()*height + 2*height*super.getWidth());
	}
}
