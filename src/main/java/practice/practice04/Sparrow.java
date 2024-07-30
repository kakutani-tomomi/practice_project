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
		String judgefly ;
		if (canFly) {
			judgefly = "飛べます";
		} else {
			judgefly  = "飛べません";
		}
		return judgefly ;
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
