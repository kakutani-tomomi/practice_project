package practice.practice04;

public class Sparrow extends Animal{
	//フィールド
	private boolean canFly;
	//コンストラクタ
	public Sparrow(String name,int age,boolean canFly) {
		super(name,age);
		this.canFly = canFly;
	}
	//アクセッサ
	public void setCanFly(boolean canFry) {
		this.canFly = canFry;
	}
	
	public String isCanFly(boolean canFly) {
		String fly;
		if(canFly) {
			fly = "飛べます";
		}else {
			fly = "飛べません";
		}
		return fly;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(isCanFly(canFly));
	}
	public void cry() {
		System.out.println("鳴き声：チュンチュン");
	}
}
