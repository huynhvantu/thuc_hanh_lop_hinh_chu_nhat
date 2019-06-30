
public class Cylinder extends Circle{
	//khai bao thuoc tinh
	private double height;
	//ham khoi tao lop con
	
	public Cylinder() {
		height = 1.0;
	}
	
	public Cylinder(double h) {
		this.height = h;
	}
	
	public Cylinder(double r, String cl, double h) {
		super.setRadius(r);
		super.setColor(cl);
		this.height = h;		
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public double getVolume() {
		return super.getArea()*this.height;
		
	}
	
	@Override
	public String toString() {
		return " hinh tru co chieu cao "
				+ getHeight()
				+ ", la lop con cua hinh tron "
				+ super.toString();
	}
}
