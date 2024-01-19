package factory_pattern.shape_example;

public class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("사각형을 그리는중");
	}
}
