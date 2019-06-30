
public class Circle {
	// khai bao thuoc tinh
	private double radius ;//bankinh
	private String color;
	//phuong thuc khoi tao - trung ten voi class
	public Circle(){
		this.radius = 1.0;
		this.color = "Red";
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}	
	
	public Circle(double r , String cl) {
		this.radius = r;
		this.color = cl;
	}
	
	//cac phuong thuc thay doi gia tri cua thuoc tinh
	public void setRadius(double r) {
		this.radius = r;
	}
	
	//khai bao phuong thuc
	public double getRadius() {
		return this.radius;//tra ve gia tri thuoc tinh Radius
	}
	
	public void setColor(String cl) {
		this.color= cl;
	}
	
	public String getColor() {
		return this.color;//tra ve gia tri thuoc tinh Color cua Object
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	// phuong thuc hien thi tat ca cac thong tin
	@Override
	public String toString() {
		return ("Radius: " + this.getRadius()+ " Color: " + this.getColor()+" Area: " +this.getArea());
	}
}
