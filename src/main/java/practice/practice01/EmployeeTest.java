package practice.practice01;

public class EmployeeTest {

	public static void main(String[] args) {
		//インスタンス生成・値セット
		Employee e1 = new Employee();
		e1.name = "山田";
		e1.age = 20;
		Employee e2 = new Employee();
		e2.name = "鈴木";
		e2.age = 30;
		//メソッド飛び出し
		e1.showInfo();
		System.out.println("--------------");
		e2.showInfo();
	}

}
