package method.q09;

public class EvenNumber {

	public static void main(String[] args) {
		int num = 13;
		boolean result = checkEven(num);

		if (result) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}

	public static boolean checkEven(int num) {
		boolean result;
		if ((num % 2) == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}