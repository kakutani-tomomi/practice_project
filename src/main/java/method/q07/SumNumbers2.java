package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		int num1 = 5;
		double num2 = 3.3;
		int result = calculateSum(num1, num2);

		System.out.println("第一引数（整数）：" + num1);
		System.out.println("第二引数（実数）：" + num2);
		System.out.println("加算結果：" + result);
	}

	public static int calculateSum(int num1, double num2) {
		int num3 = (int) num2; //double→intにキャスト
		int result = num1 + num3;
		return result;
	}
}
