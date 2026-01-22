import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lab2 {
	static JTextField text;
	static JLabel lb;
	static JButton bt;
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setBounds(760, 390, 400, 300);
		win.setTitle("Hello khemjira chaprapun 68160024 n63");
		
		JPanel bg = new JPanel();
		bg.setBackground(new Color(255,255,255));
		win.add(bg);
		
		lb = new JLabel("Please enter your name");
		bg.add(lb);
		
		text = new JTextField(13);
		bg.add(text);
		
		bt = new JButton("send");
		bg.add(bt);
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String name = text.getText();	
				try {
					lb.setText("Hello "+name);
					text.setVisible(false);
					bt.setVisible(false);
			    } catch (NumberFormatException ex) {
			    	
			  }
			}
		});
		win.setVisible(true);
	}
}
