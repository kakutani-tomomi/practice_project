package practice.practice04;

public class Sparrow extends Animal {
	//フィールド
	private boolean canFly;

	//コンストラクタ
	public Sparrow(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}

	//アクセッサ
	public void setCanFly(boolean canFry) {
		this.canFly = canFry;
	}

	public String isCanFly(boolean canFly) {
		String flyPossibility;
		if (canFly) {
			flyPossibility = "飛べます";
		} else {
			flyPossibility = "飛べません";
		}
		return flyPossibility;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(isCanFly(canFly));
	}

	public void cry() {
		System.out.println("鳴き声：チュンチュン");
	}
}
