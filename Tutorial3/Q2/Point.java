
public class Point {
	protected int x;
	protected int y;
	
	Point() {
		x = 0;
		y = 0;
	}
	
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return ("[ " + x + ", " + y + " ]");
	}
}
