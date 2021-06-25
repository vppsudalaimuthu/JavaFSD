package q41.oops.shape.hexagon;

import static java.lang.Math.PI; 

public class Circle extends Shape {

	private Integer radius;

	Circle(Integer radius) {
		super("Circle");
		this.radius = radius;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	@Override
	public Double calculateArea() {
		return PI * radius * radius;
	}

}
