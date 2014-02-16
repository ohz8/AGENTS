package band;
import java.io.File;

import org.jfugue.*;

public class Drums {
	Player player = new Player();
	Rhythm rhythm = new Rhythm();
	
	public void instPlay(){
		//the following lines create the symbols to be used in the rhythm section
		//e.g a 'O' in the pattern represents a Bass Drum sound
			rhythm.addSubstitution('O', "[BASS_DRUM]i");
			rhythm.addSubstitution('o', "Rs [BASS_DRUM]s");
			rhythm.addSubstitution('*', "[ACOUSTIC_SNARE]i");
			rhythm.addSubstitution('^', "[PEDAL_HI_HAT]s Rs");
			rhythm.addSubstitution('!', "[CRASH_CYMBAL_1]s Rs");
			rhythm.addSubstitution('.', "Ri"); 
		//creating drum pattern
			rhythm.setLayer(1, "T[Andantino] OO*OOO*OOO*OOO*");
			//Pattern pattern = rhythm.getPattern();
			player.play(rhythm);
	}
}

