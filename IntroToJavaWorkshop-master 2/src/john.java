

	import java.awt.KeyEventDispatcher;
	import java.awt.KeyboardFocusManager;
	import java.awt.event.KeyEvent;
	import java.io.File;

	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;

	import org.teachingextensions.logo.Tortoise;

	public class TortoiseInSpace implements KeyEventDispatcher {

		/*  Make the Tortoise move around the screen when the arrow keys are pressed... */
		private void moveTortoise(int keyPressed) {
			// 0. Print out the keyPressed variable and write down the numbers for each arrow key

			// 1. If the up arrow is pressed, move the Tortoise up the screen.

			// 2. If the down arrow is pressed, move the Tortoise down.

			// 3. If the left arrow is pressed, make the tortoise go left. Hint: Make sure to end with the Tortoise facing UP.
			
			// 4. If right is pressed, move the Tortoise right.
			
			// 5. Then move the Tortoise to RD-2D for a surprise! 
		}

		private void checkIfR2D2Found() throws Exception {
			int tortoiseLocationX = Tortoise.getX();
			int tortoiseLocationY = Tortoise.getY();

			if (tortoiseLocationX <= 510 && tortoiseLocationX >= 505 && tortoiseLocationY >= 110 && tortoiseLocationY <= 115)
				playEureka();
		}


}
