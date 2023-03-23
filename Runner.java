package com.qa.mockito;

import java.time.LocalDate;
import java.time.Month;


public class Runner {
	
	public static void main(String[] args) {
		LocalDate.of(1994, Month.APRIL, 4);
		Simulator sim = new Simulator();

		for (int i = 0; i < 100; i++)
			System.out.println(sim.playRPS(RPS.SCISSORS));
	}
}

