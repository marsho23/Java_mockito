import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.mockito.RPS;
import com.qa.mockito.Result;
import com.qa.mockito.Simulator;

@ExtendWith(MockitoExtension.class)
public class RPSTest{
	
	@Mock // create the mock Random object
	private Random rand;

	@InjectMocks // inserts the mock into the Simulator
	private Simulator sim;

	@Test
	void testWin() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		// rps returns WIN/LOSE/DRAW, not true/false
		for (int i = 0; i < 1000; i++)
			assertEquals(Result.WIN, this.sim.playRPS(RPS.PAPER));	
	}
	
	@Test
	void testLose() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		// rps returns WIN/LOSE/DRAW, not true/false
		for (int i = 0; i < 1000; i++)
			assertEquals(Result.LOSE, this.sim.playRPS(RPS.ROCK));	
	}
	
	@Test
	void testDraw() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		// rps returns WIN/LOSE/DRAW, not true/false
		for (int i = 0; i < 1000; i++)
			assertEquals(Result.DRAW, this.sim.playRPS(RPS.SCISSORS));	
	}


}
