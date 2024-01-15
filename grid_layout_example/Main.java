package grid_layout;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * 
 *   @author Anass Boutbila 
 *
 *   @author Tiveron Sebastiano
 */




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		frame.setLayout(new GridLayout(2, 3, 10, 10));
		
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		
		JButton bottone3 = new JButton("3");
		bottone3.setVerticalAlignment(SwingConstants.BOTTOM);	
		bottone3.setBackground(Color.green);
		frame.add(bottone3);
		
		String opzioni[] = {"Opzione 1 ", "Opzione 2 ", "Opzione 3"};
		frame.add(new JComboBox<String>(opzioni));
		
		JTextField campoTestuale = new JTextField("Prova");
		campoTestuale.setHorizontalAlignment(SwingConstants.RIGHT);

		frame.add(campoTestuale);
		
		frame.setVisible(true);
		
		
		
	}

}
