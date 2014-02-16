package band;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import org.jfugue.Player;
public class Piano {
	
	static ArrayList<Character> p_riff = new ArrayList<Character>();
	
	
	public static double getKeyValue(String key)
	{
		char key2;
		char key_tone;
		double key_value = 0;
		//check to see that one letter has been given
		if (key.length()==1){
			key2 = key.charAt(0);//cast string key as char
			key_value = (double) key2;
		}
		else{
			key2 = key.charAt(0);
			key_tone = key.charAt(1);
			if (key_tone == '#'){
				key_value = (double) key2 + 0.5;
			}
			if (key_tone == 'b'){
				key_value = (double) key2 - 0.5;	
			}
		}
		return key_value;
	}
	
	
	public static ArrayList<Character> setRiff(String key){
		
		double kvalue = getKeyValue(key);
			p_riff.add((char) kvalue);
			p_riff.add((char) kvalue);
			p_riff.add((char) (kvalue + 2.5) );
			p_riff.add((char) (kvalue + 2.5) );
			p_riff.add((char) kvalue);
			p_riff.add((char) kvalue);
			p_riff.add((char) (kvalue + 2.5) );
			p_riff.add((char) (kvalue + 2.5) );
		
		return p_riff;
	}
	
	public static void main (String[] args)
	{
		ArrayList<Character> new_riff= new ArrayList<Character>();
		Player player = new Player(); //music player initialization
		String play_riff = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Please select your key: ");
		String new_key = input.nextLine();
		
		double k_value = getKeyValue(new_key);
		
		new_riff = setRiff(new_key);
		for (int i = 0; i<new_riff.size(); i++){
			play_riff = (play_riff + " " +  new_riff.get(i));
	        System.out.println("The riff is " + play_riff);
		}
		
		
		
		System.out.println("The key is " + new_key + " and the value is " + k_value);
		player.play(play_riff);
	}
	
	
}
			
			
			
			
			
		
		
		/*
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
*/