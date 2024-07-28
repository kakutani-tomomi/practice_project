package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		int count = getEvenNumbers(array);

		System.out.println(Arrays.toString(array) + "には、偶数が" + count + "個あります。");
	}

	public static int getEvenNumbers(int array[]) {
		int count = 0;
		//配列内の偶数個数検査
		for (int arrayNum : array) {
			if ((arrayNum % 2) == 0) {
				count++;
			}
		}
		return count;
	}
}
