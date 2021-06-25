package q40.oops.shape;

public class Square extends Shape {

	private Integer side;

	Square(Integer side) {
		super("Square");
		this.side = side;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	@Override
	public Double calculateArea() {
		return (double) (side * side);
	}

}
