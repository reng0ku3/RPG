package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damageH = Dice.get(1,10) * getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - damageH); 
		// コンソールにステータスを表示
		System.out.printf("\n「%s」が「%s」で攻撃！「%s」に%dのダメージを与えた。\n"
				,name,weapon,target.name,damageH);
		System.out.println();
		if(target.getHp() <= 0) {
			System.out.printf(" ★ 「%s」は倒れた。\n",target.name);
			System.out.println();
			}
	}
}