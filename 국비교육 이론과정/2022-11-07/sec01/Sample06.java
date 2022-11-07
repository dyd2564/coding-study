package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import sec01.Apple.Color;

public class Sample06 {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple(Color.RED));
		apples.add(new Apple(Color.BLUE));
		apples.add(new Apple(Color.GREEN));
		apples.add(new Apple(Color.YELLOW));
		System.out.println(apples);
		
		apples.remove(new Apple(Color.RED));
		System.out.println(apples);
		
	}
}

class Apple{
	public enum Color{RED, BLUE, GREEN, YELLOW}

	Color color;
	
	public Apple(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return color == other.color;
	}

	

	
	
	
}
