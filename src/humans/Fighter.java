package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	// コンストラクタ
	public Fighter(String name, String weapon) {
		super(name,weapon);
		hp = Dice.get(240,300);
		offensive = Dice.get(17,23);	
	}
}