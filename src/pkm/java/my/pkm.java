
package pkm.java.my;


abstract class pkm {
    public final int maxHealth;
    protected double weight;
    protected double height;
    protected int health;
    protected String name;
    protected pkmSkill attackSkill;
    protected pkmSkill untimatedSkill;

	public pkm(String name, int maxHealth,double weight,double height){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
                this.weight=weight;
                this.height=height;
                
	}

	public int getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
	
	public void eat(Food food){
		this.weight += food.getWeight();
                this.height += food.getHeight();
	}
        public void drink(Food food){
		this.health += food.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
	}
        public double getWeight(){
            return this.weight;
        }
        public double getHeight(){
            return this.height;
        }
        public void setWeight(double w){
            this.weight=w;
        }
        public void setHeight(double h){
            this.height=h;
        }

	public void attack(pkm rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(pkm rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(pkmSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(int value){
		this.health -= value;
		if(this.health < 0)
			this.health = 0;
	}
        public abstract void move();
    
}
