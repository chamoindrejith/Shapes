class Square extends Rectangle{
	Square(double side, String colour, boolean filled){
		super(side,side,colour,filled);
	}
	public double getSide(){
		return getWidth();
	}
	public void setSide(double side){
		setWidth(side);
		setLength(side);
	}
	@Override
	public String toString() {
		return "A Square with side = " + getSide()+ ", which is a Subclass of " + super.toString();
	}
}
