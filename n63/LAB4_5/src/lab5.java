
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lab5 {
    static JTextField num;
    static JLabel lb1,lb2,lb3,lb4;
    static JButton bt;
    public static void main(String[] args) {

        int num1 = (int)(Math.random()*(9+1)+1);
        int num2 = (int)(Math.random()*(9+1)+1);

        JFrame win = new JFrame();
        win.setBounds(760, 390, 400, 300);
        win.setTitle("Easy Math quiz");

        JPanel bg = new JPanel();
        bg.setBackground(Color.WHITE);
        win.add(bg);

        lb1 = new JLabel();
        lb1.setText(String.valueOf(num1));
        bg.add(lb1);

        lb2 = new JLabel(" + ");
        bg.add(lb2);

        lb3 = new JLabel();
        lb3.setText(String.valueOf(num2));
        bg.add(lb3);

        lb4 = new JLabel(" = ");
        bg.add(lb4);

        num = new JTextField(5);
        bg.add(num);

        bt = new JButton("answer");
        bg.add(bt);

        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(num.getText());
                int n1 = Integer.parseInt(lb1.getText());
                int n2 = Integer.parseInt(lb3.getText());

                int sum = n1+n2;

                lb1.setVisible(false);
                lb2.setVisible(false);
                lb3.setVisible(false);
                num.setVisible(false);
                bt.setVisible(false);
                if(n == sum) {
                    lb4.setText("Your answer is Correct");
                } else {
                    lb4.setText("Your answer is Wrong");
                }
            }
        });
        win.setVisible(true);
    }
}
