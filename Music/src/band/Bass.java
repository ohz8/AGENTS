package band;

import org.jfugue.*;
//always in voice 1
//pattern layout (voice|tempo|instrument|notes)
public class Bass {
	static Player player = new Player();

	public static Pattern instPlay(){
		Pattern bPattern = new Pattern();
		bPattern.add("V1 T[Moderato] I33 A2i. A2s A2i. A2s A2i. A2s A2i. A2s");
		return bPattern;
	}

}
