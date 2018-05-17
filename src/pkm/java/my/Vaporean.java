
package pkm.java.my;

public class Vaporean extends pkm implements Swimming{
    
    private static final int maxGroupHealth = 100;
    private static int Health=(int)(Math.random()*1000) % (maxGroupHealth+30);
    protected String type = "Water";
	public Vaporean(double weight,double height){
               
		super("Vaporean",Health,weight,height);
		this.attackSkill = pkmSkill.getpkmSkill("Water Gun");
		this.untimatedSkill = pkmSkill.getpkmSkill("Aqua Tail");
                
        }
        
    @Override
    public void move() {
        this.swim();
        this.walk();
    }
    @Override
    public void swim() {
        this.reducedHealth(10);
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
