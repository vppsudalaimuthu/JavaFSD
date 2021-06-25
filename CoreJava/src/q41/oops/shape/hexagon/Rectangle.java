package q41.oops.shape.hexagon;

public class Rectangle extends Shape {

	private Integer length;
	private Integer breadth;

	Rectangle(Integer length, Integer breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getBreadth() {
		return breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}

	@Override
	public Double calculateArea() {
		return (double) (length * breadth);
	}

}
