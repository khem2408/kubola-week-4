

import javax.swing.*;
import java.awt.*;

public class lab8 {
    public static void main(String[] args) {
        JFrame win = new JFrame("BMI Calculator for people health");
        win.setBounds(760, 390, 400, 300);

        JPanel bg = new JPanel();
        win.add(bg, BorderLayout.NORTH);

        JLabel lb1 = new JLabel("Weight : ");
        bg.add(lb1);
        JTextField ansW = new JTextField(5);
        bg.add(ansW);
        JLabel lb2 = new JLabel("Height : ");
        bg.add(lb2);
        JTextField ansH = new JTextField(5);
        bg.add(ansH);

        JPanel panelBt = new JPanel();
        win.add(panelBt,BorderLayout.CENTER);

        JButton bt = new JButton("Calculate");
        panelBt.add(bt);

        bt.addActionListener(e->{
            int n1 = Integer.parseInt(ansW.getText());
            int n2 = Integer.parseInt(ansH.getText());
            double w = n2/100.0;

            double bmi = n1/Math.pow(w,2);
            String result = String.format("%.2f", bmi);

            win.setVisible(false);

            if (bmi < 18.5){
                JOptionPane.showMessageDialog(null,"Your BMI is "+result+"\n"+"You are under weight");
            } else if (bmi <= 24.9 && bmi > 18.5) {
                JOptionPane.showMessageDialog(null,"Your BMI is "+result+"\n"+"You are normal weight");
            } else if (bmi <= 29.9 && bmi > 24.9) {
                JOptionPane.showMessageDialog(null,"Your BMI is "+result+"\n"+"You are overweight");
            } else if (bmi <= 34.9 && bmi > 29.9) {
                JOptionPane.showMessageDialog(null,"Your BMI is "+result+"\n"+"You are obese weight");
            } else {
                JOptionPane.showMessageDialog(null,"Your BMI is "+result+"\n"+"You are extremely obese weight");
            }

        });
        win.setVisible(true);
    }
}
