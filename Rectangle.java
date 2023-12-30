class Rectangle extends Shape{
	private double width, length;
	Rectangle(){
		length=1.0;
		width=1.0;
	}
	Rectangle(double width, double length){
		this.width=width;
		this.length=length;
	}
	Rectangle(double width, double length,String colour, boolean filled){
		super(colour,filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double setArea(){
		double area = width*length;
		return area;
	}
	public double setPerimeter(){
		double peri = 2*(length+width);
		return peri;
	}
	public String toString() {
		return "A Rectangle with width = " + this.width+ ", length ="+ this.length + " which is a Subclass of " + super.toString();
	}
}
