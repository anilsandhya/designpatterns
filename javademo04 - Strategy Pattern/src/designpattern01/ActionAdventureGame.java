package designpattern01;

/* this is main method */

public class ActionAdventureGame {
	public static void main(String[] args) {
		Character king = new King();
		king.fight();
		king.setWeapon(new BowAndArrowBehavior());
		king.newWeapon();
		king.setWeapon(new SwordBehavior());
		king.newWeapon();
		
		Character queen = new Queen();
		queen.fight();
		queen.setWeapon(new KnifeBehavior());
		queen.newWeapon();
		
		Character troll = new Troll();
		troll.fight();
		troll.setWeapon(new AxeBehavior());
		troll.newWeapon();
		
		Character knight = new Knight();
		knight.fight();
		knight.setWeapon(new SwordBehavior());
		knight.newWeapon();
	}
}
