package com.qa.mockito;

import java.util.Random;

public class Simulator {
	private Random rand = new Random(); // mock it viciously

	public Result playRPS(RPS playerChoice) {
		int randNum = this.rand.nextInt(3);
		RPS cpuChoice;
		if (randNum == 0)
			cpuChoice = RPS.ROCK;
		else if (randNum == 1)
			cpuChoice = RPS.PAPER;
		else
			cpuChoice = RPS.SCISSORS;

		System.out.println("You picked: " + playerChoice + " CPU picked: " + cpuChoice);
		
		System.out.println(playerChoice.beats(cpuChoice));
		
		return playerChoice.beats(cpuChoice);

	}
}
