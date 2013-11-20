package band;
import  org.jfugue.*;
public class Piano {
	public static void main (String[] args)
	{
			
			//Tempo rhythm = new Tempo(50);
			//Pattern pattern = new Pattern("E6s D#6s | E6s D#6s E6s B5s D6s C6s | A5i.");
			
			// "First Bar, 4 times"
			Pattern pattern1 = new Pattern("A#4q C5q C#5q C5q");

			// "Second Bar, twice"
			Pattern pattern2 = new Pattern("D#5q F5q F#5q F5q");

			// "Third Bar"
			Pattern pattern3 = new Pattern("E5q E5q E5q E5q D#5q D#5q D#5q D#5q");

			//outro
			Pattern pattern4 = new Pattern("A#4s");
			
			// Put all of the patters together to form the song
			Pattern song = new Pattern();
			song.add(pattern1, 4);
			song.add(pattern2, 2);
			song.add(pattern1, 2);
			song.add(pattern3, 1);
			song.add(pattern1, 2);
			song.add(pattern4, 1);
			
			// Play the song!
			Player player = new Player(); player.play(song);
			//Pattern doubleMeasureRest = new Pattern("Rw Rw");

			
			//player.play(pattern);
			
	}
	
}
