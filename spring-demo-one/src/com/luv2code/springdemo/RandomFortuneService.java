package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Nie odwracaj siê za siebie bo Ci z przodu ktoœ ...",
			"Ka¿da pora¿ka zbli¿a do sukcesu",
			"Ciesz siê z ma³ych rzeczy"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
