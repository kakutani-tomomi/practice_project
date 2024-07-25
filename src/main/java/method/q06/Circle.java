package method.q06;

public class Circle {

	public static void main(String[] args) {
		double radius = 5.0;
		double circleArea = getCircleArea(radius);
		
		System.out.println("半径：" + radius);
		System.out.println("円の面積：" + ((Math.floor(circleArea * 10)) / 10));
	}

	public static double getCircleArea(double radius) {
		double circleArea = (radius * radius) * Math.PI;
		return circleArea;

	}

}
