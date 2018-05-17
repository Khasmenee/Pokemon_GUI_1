
package pkm.java.my;


public class Food {
    private String name;
	private int restoreValue;
	private int type;
        private double weight;
        private double height;
        

	public Food(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Bilberry";
				this.weight = 0.25;
                                this.height = 0.01;
				break;
			case 1: this.name = "Couberry";
				this.weight = 0.5;
                                this.height = 0.25;
				break;
			case 2: this.name = "Strawberry";
				this.weight = 1.0;
                                this.height = 0.5;
				break;
                        case 3: this.name = "Health1";
                                this.restoreValue = 10;
				break;
                        case 4: this.name = "Health2";
				this.restoreValue = 30;
				break;
			case 5: this.name = "Health3";
				this.restoreValue = 100;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public int getRestoreValue(){
		return this.restoreValue;
	}
        public double getWeight(){
            return this.weight;
        }
        public double getHeight(){
            return this.height;
        }
}
