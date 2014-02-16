package band;
import java.io.File;

import org.jfugue.*;

public class Drums {
	public static void main(String[] args){
		Tempo tempo = new Tempo(50);
		
		Player player = new Player();
		Rhythm rhythm = new Rhythm();
		rhythm.setLayer(1, "O..oO...O..oOO..");
		rhythm.setLayer(2, "..*...*...*...*.");
		rhythm.setLayer(3, "^^^^^^^^^^^^^^^^");
		//rhythm.setLayer(4, "...............!");
		rhythm.addSubstitution('O', "[BASS_DRUM]i");
		rhythm.addSubstitution('o', "Rs [BASS_DRUM]s");
		rhythm.addSubstitution('*', "[ACOUSTIC_SNARE]i");
		rhythm.addSubstitution('^', "[PEDAL_HI_HAT]s Rs");
		rhythm.addSubstitution('!', "[CRASH_CYMBAL_1]s Rs");
		rhythm.addSubstitution('.', "Ri"); 
		Pattern pattern = rhythm.getPattern();
		File drumbeat = new File("drumbeat");
		
		try{
			player.saveMidi(pattern, drumbeat);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		rhythm.getPattern();
		
		pattern.repeat(4);
	}
}
