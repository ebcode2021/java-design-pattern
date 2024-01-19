package factory_pattern.shape_example;

public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("원을 그리는중");
	}
}
