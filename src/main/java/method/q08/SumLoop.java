package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int minNum = 1;
		int maxNum = 100;
		int result = sumLoop(minNum, maxNum);

		System.out.println("最小値：" + minNum);
		System.out.println("最大値：" + maxNum);
		System.out.println("加算結果：" + result);
	}

	public static int sumLoop(int minNum, int maxNum) {
		int result = 0;
		while (minNum <= maxNum) {
			result += minNum;
			minNum++;
		}
		return result;
	}
}
