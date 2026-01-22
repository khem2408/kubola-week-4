
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lab4 {
	static JTextField num1,num2,num3;
	static JLabel lb;
	static JButton bt;
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setBounds(760, 390, 400, 300);
		win.setTitle("Hello khemjira chaprapun 68160024 n63");
		
		JPanel bg = new JPanel();
		bg.setBackground(new Color(255,255,255));
		win.add(bg);
		
		num1 = new JTextField(5);
		bg.add(num1);
		
		num2 = new JTextField(5);
		bg.add(num2);
		
		num3 = new JTextField(5);
		bg.add(num3);
		
		bt = new JButton("Grade");
		bg.add(bt);
		
		lb = new JLabel(" ");
		bg.add(lb);
		lb.setVisible(false);
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
					double n1 = Double.parseDouble(num1.getText());
					double n2 = Double.parseDouble(num2.getText());
					double n3 = Double.parseDouble(num3.getText());
					double sum = n1+n2+n3;
					
					String grade = "";
					if (sum >= 80) {grade = "A";}
		            else if (sum >= 70) {grade = "B";}
		            else if (sum >= 60) {grade = "C";}
		            else if (sum >= 50) {grade = "D";}
		            else {grade = "F";}
					
					lb.setText(grade);
					
			}
		});
		lb.setVisible(true);
		win.setVisible(true);
	}
}public class lab4 {

}
