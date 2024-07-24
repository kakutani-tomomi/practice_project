package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int ans = i * j;
				System.out.print(" ");
				if (ans < 10) {
					//乗算結果が10以下の時スペース追加
					System.out.print(" ");
				}
				//乗算結果表示
				System.out.print(ans);
			}
			System.out.println();
		}
	}
}
