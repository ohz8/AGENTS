package band;
import org.jfugue.*;;

public class Stage {
	public static Player sPlayer = new Player();
	public static Pattern sPattern = new Pattern();
	public static int key = 0;
	
	public static void main(String[] args){
		Bass b = new Bass();
		Conductor c = new Conductor(); 
		Drums d = new Drums();
		Piano p = new Piano();
		new KeySelector().setVisible(true);
		int pick = c.instPick();
		if(pick == 1){//start with drums
			System.out.println("Playing Drums...");
			d.instPlay();
		}
		if(pick==2){//start with bass
			System.out.println("Playing Bass...");
			b.instPlay();
		}
		if(pick==3){//start with piano
			System.out.println("Playing Piano...");
			p.instPlay();
		}
		//sPattern.add(Guitar.instPlay(), 4);
		//sPattern.add(Bass.instPlay(), 4);
		//sPlayer.play(sPattern);
	}

}
