package practice.practice04;

public class AnimalTest {

	public static void main(String[] args) {
		//インスタンス生成・初期化
		Dog dog = new Dog("ポチ", 2, "白");
		Sparrow sparrow = new Sparrow("チュン", 1, true);
		//操作
		dog.showInfo();
		dog.cry();

		System.out.println("--------------------");

		sparrow.showInfo();
		sparrow.cry();
	}
}
