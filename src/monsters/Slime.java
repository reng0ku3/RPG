package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster{
	// コンストラクタ
	public Slime(String name, String weapon) {
		super(name,weapon);
		hp = Dice.get(70,130);
		offensive = Dice.get(7,13);
	}
}