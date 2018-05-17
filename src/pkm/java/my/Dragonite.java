
package pkm.java.my;

public class Dragonite extends pkm implements Flying{
    private static final int maxGroupHealth = 200;
    private static final int Health=(int)(Math.random()*1000) % (maxGroupHealth+80);
    protected String type = "Flying";
	public Dragonite(double weight,double height){
		super("Dragonite",Health,weight,height);

		this.attackSkill = pkmSkill.getpkmSkill("Dragon Tail");
		this.untimatedSkill = pkmSkill.getpkmSkill("Outrage");
	}
    @Override
    public void move() {
        this.fly();
        this.walk();
    }
    @Override
    public void fly() {
        this.reducedHealth(40);
    }
    @Override
    public void walk() {
        this.reducedHealth(10);
    }
    public String getType(){
        return this.type;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
