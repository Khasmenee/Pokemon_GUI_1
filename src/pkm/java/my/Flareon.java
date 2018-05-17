
package pkm.java.my;

public class Flareon extends pkm implements Running{
    private static final int maxGroupHealth = 150;
    private static final int Health=(int)(Math.random()*1000) % (maxGroupHealth+50);
    protected String type = "Fire";
	public Flareon(double weight,double height){
		super("Flareon",Health,weight,height);

		this.attackSkill = pkmSkill.getpkmSkill("Flame Tail");
		this.untimatedSkill = pkmSkill.getpkmSkill("Flamethrower");
	}
    @Override
    public void move() {
        this.run();
        this.walk();
    }
    @Override
    public void run() {
        this.reducedHealth(20);
    }
    @Override
    public void walk() {
        this.reducedHealth(5);
    }
    public String getType(){
        return this.type;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
