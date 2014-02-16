package band;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import org.jfugue.Player;
public class Piano {
	
	static ArrayList<Character> p_riff = new ArrayList<Character>();
	
	
	/*public static double getKeyValue(String key)
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
	}*/
	
	
	public static ArrayList<Character> introRiff(int key){
		return null;
			
	}
	
	public void instPlay(){
		ArrayList<Character> new_riff = new ArrayList<Character>();
		Player player = new Player(); //music player initialization
		String play_riff = "";		
		
		new_riff = introRiff(Stage.key);
		for (int i = 0; i<new_riff.size(); i++){
			play_riff = (play_riff + " " +  new_riff.get(i));
	        System.out.println("The riff is " + play_riff);
		}
		
		System.out.println("The key is " + new_key + " and the value is " + k_value);
		player.play(play_riff);
	}
	
	private ArrayList<Integer> pattern1(int keyvalue){
		
		return null;
		
	}
	
	public static void main (String[] args)
	{
		
		
		
		
		
	}
}
			
			
			
			