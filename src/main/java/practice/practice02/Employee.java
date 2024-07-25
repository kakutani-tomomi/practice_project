package practice.practice02;

public class Employee {
	private String name;
	private int age;
	//引数・処理なしコンストラクタ
	public Employee(){
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
}
