package practice.practice03;

public class Employee {
	//フィールド
	private String name;
	private int age;

	//コンストラクタ
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//アクセッサ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void selfIntroduction() {
		System.out.println("氏名：" + name);
		System.out.println("年齢：" + age);
	}

}
