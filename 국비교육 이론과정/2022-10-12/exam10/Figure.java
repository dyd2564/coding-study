package exam10;

public class Figure {

	static void area() {
		System.out.println("도형의 넓이");
	}
}

class Circle extends Figure {
	
	static void area() {
		System.out.println("원의 넓이");
	}
}
