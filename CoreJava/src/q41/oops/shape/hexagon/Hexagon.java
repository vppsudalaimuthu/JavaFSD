package q41.oops.shape.hexagon;

public class Hexagon extends Shape {

	private Integer side;

	Hexagon(Integer side) {
		super("Hexagon");
		this.side = side;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

}
