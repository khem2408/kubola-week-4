
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lab7 {
    static JTextField num;
    static JLabel lb,lb1, lb2, lb3, lb4;
    static JButton bt;
    static int count = 0,sumN = 0;
    static int randomCal, num1, num2;

    public static void main(String[] args) {

        JFrame win = new JFrame("Easy Math quiz");
        win.setBounds(760, 390, 400, 300);

        JPanel bg = new JPanel();
        win.add(bg);

        lb = new JLabel();

        lb1 = new JLabel();
        lb2 = new JLabel();
        lb3 = new JLabel();
        lb4 = new JLabel(" = ");

        num = new JTextField(5);
        bt = new JButton("answer");

        bg.add(lb);
        bg.add(lb1);
        bg.add(lb2);
        bg.add(lb3);
        bg.add(lb4);
        bg.add(num);
        bg.add(bt);

        lb.setText("Question "+1+" : ");
        randomQuestion();

        bt.addActionListener(e -> {
            int user = Integer.parseInt(num.getText());
            int sum = 0;
            if (randomCal == 1) sum = num1 + num2;
            else if (randomCal == 2) sum = num1 - num2;
            else sum = num1 * num2;

            if (user == sum) {
                lb4.setText("Correct!");
                sumN++;
            }else {
                lb4.setText("Wrong!");
            }

            count++;

            if (count < 10) {
                lb.setText("Question "+(count+1)+" : ");
                randomQuestion();
            } else {
                lb.setVisible(false);
                lb1.setVisible(false);
                lb2.setVisible(false);
                lb3.setVisible(false);
                num.setVisible(false);
                bt.setVisible(false);
                lb4.setText("Finish! your score is "+sumN+"/10");
            }
        });
        win.setVisible(true);
    }

    static void randomQuestion() {
        num1 = (int)(Math.random() * 10 + 1);
        num2 = (int)(Math.random() * 10 + 1);
        randomCal = (int)(Math.random() * 3 + 1);

        lb1.setText(String.valueOf(num1));
        lb3.setText(String.valueOf(num2));
        num.setText("");

        if (randomCal == 1) lb2.setText(" + ");
        else if (randomCal == 2) lb2.setText(" - ");
        else lb2.setText(" * ");

        lb4.setText(" = ");
    }
}
