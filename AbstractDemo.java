public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.findArea();
		c.findPerimeter();
		Rectangle r = new Rectangle(4, 7);
		r.findArea();
		r.findPerimeter();
		Triangle t = new Triangle(6, 9);
		t.findPerimeter();

	}

}

// class abstract Figure
abstract class Figure {
	double dim1;

	// two abstract methods
	abstract void findArea();

	abstract void findPerimeter();
}

// hierarchical inheritance
class Circle extends Figure {
	float a, pi, c;
	int r;

	// constructor
	Circle() {
		pi = 3.14f;
		r = 5;
	}

	@Override
	void findArea() {
		// TODO Auto-generated method stub
		// formula to calculate area of circle
		a = pi * r * r;
		System.out.println("Area of circle is " + a);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		// formula to calculate perimeter of circle
		c = 2 * pi * r;
		System.out.println("Perimeter of circle is " + c);

	}

}

class Rectangle extends Figure {

	int l, w, a, p;

	// parameterised constructor
	Rectangle(int l, int w) {
		this.l = l;
		this.w = w;
	}

	@Override
	void findArea() {
		// TODO Auto-generated method stub
		// formula to calculate area of rectangle
		a = l * w;
		System.out.println("Area of Rectangle is " + a);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		// formula to calculate perimeter of rectangle
		p = 2 * (l + w);
		System.out.println("Perimeter of Rectangle is " + p);
	}

}

class Triangle extends Figure {
	int h, b, a, sidea, sideb, sidec, p;

	// parameterised constructor
	Triangle(int h, int b) {
		this.h = h;
		this.b = b;
		sidea = 20;
		sideb = 20;
		sidec = 30;
	}

	@Override
	void findArea() {
		// TODO Auto-generated method stub
		a = (h * b) / 2;
		System.out.println("Area of Triangle is " + a);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		// call local method findArea
		this.findArea();
		// formula to calculate perimeter of triangle
		p = sidea + sideb + sidec;
		System.out.println("Perimeter of Triangle is " + p);
	}

}