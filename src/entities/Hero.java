package entities;

import java.util.Random;

public class Hero {
	private String name;
	private Integer initialHability;
	private Integer initialStamina;
	private Integer initialLuck;
	
	
	public Hero() {
	}

	public Hero(String name) {
		this.name = name;
		Random rand = new Random();
		initialHability = rand.nextInt(6) + 1 + 6;
		initialStamina = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1) + 12;
		initialLuck = rand.nextInt(6) + 1 + 6;
	}

	public String getName() {
		return name;
	}

	public Integer getInitialHability() {
		return initialHability;
	}

	public void setInitialHability(Integer initialHability) {
		this.initialHability = initialHability;
	}

	public Integer getInitialStamina() {
		return initialStamina;
	}

	public void setInitialStamina(Integer initialStamina) {
		this.initialStamina = initialStamina;
	}

	public Integer getInitialLuck() {
		return initialLuck;
	}

	public void setInitialLuck(Integer initialLuck) {
		this.initialLuck = initialLuck;
	}

	@Override
	public String toString() {
		return "Name: " 
				+ name 
				+ " / Hability: " 
				+ initialHability
				+ " / Stamina: " 
				+ initialStamina
				+ " / Luck: " 
				+ initialLuck;
	}
	
	
	
	
	
	
}
