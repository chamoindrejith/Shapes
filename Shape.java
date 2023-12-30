class Shape{
	private String colour;
	private boolean filled;

	Shape(){
		colour="green";
		filled=true;
	}
	Shape(String colour, boolean filled){
		this.colour=colour;
		this.filled=filled;
	}
	public String getColour(){
		return colour;
	}
	public boolean getFilled(){
		return filled;
	}
	public void setColour(String colour){
		this.colour=colour;
	}
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	public String toString() {
		return "A shape with colour" + this.colour+ " and " + this.filled;
	}
}
