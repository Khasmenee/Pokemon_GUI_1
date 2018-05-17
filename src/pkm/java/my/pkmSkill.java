
package pkm.java.my;

public class pkmSkill {
    private final String name;
    private final int damage;
    public pkmSkill(String name, int damage){
	this.name = name;
	this.damage = damage;
    }

    public String getName(){
	return this.name;
    }

    public int getDamage(){
	return this.damage;
    }

    public static pkmSkill getpkmSkill(String name){
	pkmSkill skill = null;
	switch(name.toLowerCase()){
        	case "water gun":
                    skill = new pkmSkill("Water Gun", 30);
                    break;
                case "aqua tail":
                    skill = new pkmSkill("Aqua Tail", 100);
                    break;
		case "flame tail":
                    skill = new pkmSkill("Flame Tail", 10);
                    break;
		case "flamethrower":
                    skill = new pkmSkill("Flamethrower", 80);
                    break;
                case "dragon tail":
                    skill = new pkmSkill("Dragon Tail", 20);
                    break;
		case "outrage":
                    skill = new pkmSkill("Outrage", 70);
                    break;
	}
	return skill;
    }
}
