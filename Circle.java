class Circle extends Shape{
	private double radius;
	Circle(){
		radius=1.0;
	}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius,String colour, boolean filled){
		super(colour,filled);
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}

	public double getArea(){
		double area = Math.PI*radius*radius;
		return area;
	}
	public double getPerimeter(){
		double peri = 2*Math.PI*radius;
		return peri;
	}
	public String toString() {
		return "A Circle with radius =" + this.radius+ ", which is a Subclass of " + super.toString();
	}
}
