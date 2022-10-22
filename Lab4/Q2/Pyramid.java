
// square-base Pyramid
public class Pyramid extends Triangle implements _3d {
	// height refers to vertical height
	public Pyramid(int height, int base) {
		super(height, base);
	}
	
	public double getVolume() {
		return (1.0 / 3.0) * Math.pow(super.getBase(), 2) * super.getHeight();
	}

	public double getSurfaceArea() {
		return ((super.getBase()*super.getBase()) + 4*0.5*super.getBase()*super.getHeight());
	}
}
