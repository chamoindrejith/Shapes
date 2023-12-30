class ShapeDemo{
	public static void main(String[] args) {
		Shape sh = new Shape("red",true);

		System.out.println(sh.toString());

		Circle c1 = new Circle(7.0,"red", true);
		Circle c2 = new Circle(2.1,"blue", false);

		System.out.println(c1.toString());
		System.out.println(c2.toString());

		Rectangle r1 = new Rectangle(20,30,"red",true);
		Rectangle r2 = new Rectangle(35.5, 45.6,"yellow",false);

		System.out.println(r1.toString());
		System.out.println(r2.toString());

		Square s1 = new Square(50,"green",true);

		System.out.println(s1.toString());
	}
}
