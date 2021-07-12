package com.qa.rockpaper;

import java.util.Random;

public class Rockpaper {
	
	private Random rand = new Random();
	
	public Hand handsign(Hand handsign) {
		
		int rng = rand.nextInt(100);
		
		Hand result = null;
		
		if (rng < 33) {
			result = Hand.ROCK;
		} else if (rng < 66) {
			result = Hand.PAPER;
		} else {
			result = Hand.SCISSORS;
		}
		
		System.out.println("Your hand is " + handsign + " while my hand is "+ result);
		
		if (handsign == Hand.ROCK && result == Hand.PAPER ) {
			System.out.println("You Lose!");
		}
		else if (handsign == Hand.ROCK && result == Hand.SCISSORS ) {
			System.out.println("You Win!");
		}
		
		else if (handsign == Hand.PAPER && result == Hand.SCISSORS ) {
			System.out.println("You Lose!");
		}
		else if (handsign == Hand.PAPER && result == Hand.ROCK ) {
			System.out.println("You Win!");
		}
		else if (handsign == Hand.SCISSORS && result == Hand.ROCK ) {
			System.out.println("You Lose!");
		}
		else if (handsign == Hand.SCISSORS && result == Hand.PAPER ) {
			System.out.println("You Win!");
		}
		
		else {
			System.out.println("Go again!");
		}
		
		return null;
		
		
		
		
		
	}

}
