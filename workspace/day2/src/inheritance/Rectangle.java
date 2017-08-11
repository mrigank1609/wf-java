package inheritance;

public class Rectangle extends Figure {

	@Override
	public float getArea() {
		return dim1*dim2;
	}

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

}
