package band;

public class Generator {

	/**
	 * @param args
	 */
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


	//adding comment for git check
}
