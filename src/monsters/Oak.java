package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster{
	// コンストラクタ
	public Oak(String name, String weapon) {
		super(name,weapon);
		hp = Dice.get(170,230);
		offensive = Dice.get(9,15);	
	}
}
