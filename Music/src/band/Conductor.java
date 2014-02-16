package band;

public class Conductor {
	
	public static int instPick(){
		int num = 10;
		while (num>4||num==0){
			num = (int)(Math.random()*10);
		}
		return num;	
	}
	
}
