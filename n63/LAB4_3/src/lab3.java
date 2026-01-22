
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lab3 {
	static JTextField text;
	static JLabel lb,lb2;
	static JButton bt;
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setBounds(760, 390, 400, 300);
		win.setTitle("Hello patsachon suetrong 68160157 n87");
		
		JPanel bg = new JPanel();
		bg.setBackground(new Color(255,255,255));
		win.add(bg);
		
		JPanel bg2 = new JPanel();
		bg.setLayout(new FlowLayout());
		bg.add(bg2);
		bg2.setVisible(false);
		
		lb = new JLabel("Please enter your name");
		bg.add(lb);
		
		lb2 = new JLabel();
		bg2.add(lb2);
		
		text = new JTextField(13);
		bg.add(text);
		
		bt = new JButton("send");
		bg.add(bt);
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String name = text.getText();
				bg2.setVisible(true);
				lb2.setText("Hello "+name);
			}
		});
		win.add(bg2,BorderLayout.SOUTH);
		win.setVisible(true);
	}
}
