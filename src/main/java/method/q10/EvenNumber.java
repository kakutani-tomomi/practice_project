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
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) == 0) {
				count++;
			}
		}
		return count;
	}
}
