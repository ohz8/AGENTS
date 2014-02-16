package band;

import java.util.ArrayList;

import org.jfugue.Pattern;
import org.jfugue.Player;
//always in voice 0
public class Guitar {
	static Player player = new Player();
	static Pattern gPattern = new Pattern();
	ArrayList<String>g_riff = new ArrayList();
	
	public static Pattern instPlay(int key){
		
		gPattern.add("V0 T[Presto] I26 " +
				"[" + key + "]q. [35]i [37]q. [37]i [35]q. [35]i [37]q. [37]i"); //four beat scale
		return gPattern;
	}
	

}
