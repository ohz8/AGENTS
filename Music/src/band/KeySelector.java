package band;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class KeySelector extends JFrame{

	JComboBox jcbSelector;
	JComboBox jcbOctave;
	JLabel jlSelectKey;
	
	JPanel jpFront;
	JPanel jpMiddle;
	
	JButton jbJam;
	
	public KeySelector(){
		super("Blues Band Simulator");
		setLayout(new GridLayout(1, 3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 70);
		makewidgets();
		pack();
	}
	
	
	private void makewidgets() {
		String [] keys = new String[12];
		
		keys[0] = ("C");
		keys[1] = ("C#");
		keys[2] = ("D");
		keys[3] = ("D#");
		keys[4] = ("E");
		keys[5] = ("F");
		keys[6] = ("F#");
		keys[7] = ("G");
		keys[8] = ("G#");
		keys[9] = ("A");
		keys[10] = ("A#");
		keys[11] = ("B");
		
		String [] octs = new String[11];
		for (int a = 0; a<11; a++){
			octs[a] = (a + "");
		}
		
		jcbSelector = new JComboBox(keys);
		jcbOctave = new JComboBox(octs);
		
		jbJam = new JButton("Start Jam!");
		jbJam.addActionListener(process);
		
		jpFront = new JPanel(new GridLayout(4, 1));
		jpMiddle = new JPanel(new FlowLayout());
		jpFront.add(new JLabel("Select a Key to Begin"));
		jpMiddle.add(new JLabel("Key:"));
		jpMiddle.add(jcbSelector);
		jpMiddle.add(new JLabel("Octave:"));
		jpMiddle.add(jcbOctave);
		jpMiddle.add(new JLabel());
		jpFront.add(jpMiddle);
		jpFront.add(new JLabel("     "));
		jpFront.add(jbJam);
		add(jpFront);
		
	}


	ActionListener process = new ActionListener(){
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == jbJam){
				Stage.key = jcbSelector.getSelectedIndex() + ((int)jcbOctave.getSelectedIndex()*12);
				System.out.println(Stage.key);
			}
		}
	};
}
