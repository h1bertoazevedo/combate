package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	//Construtor
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}
	
	//Methods
	public String status() {
		if (this.life <= 0) {
			return  this.getName()
					+ ": "
					+ "0 "
					+ " de vida (morreu)";
					
		}else {
		    return  name
		    		+ " : "
		    		+ life 
		    		+ " de vida ";
		}
	    		
	}

	public void takeDamage(Champion opponent) {
	    if (opponent.attack <= this.armor) {
	    	 this.life = this.life - 1;
	    }else {
	    this.life = this.life - opponent.attack;
	    this.life = this.life + this.armor;
	    }
	}
}
	
	