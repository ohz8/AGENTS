package band;
import org.jfugue.*;

public class Drums {
	public static void main(String[] args){
		Player player = new Player();
		Rhythm rhythm = new Rhythm();
		rhythm.addSubstitution('O', "[ACOUSTIC_SNARE]q");
		rhythm.setLayer(1, "'O' 'O' oo'O' oo'O' oo'O'");
		player.play(rhythm);
	}
}
