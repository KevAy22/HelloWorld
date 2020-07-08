package KevinsCoffeeShop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class App {
    private JLabel title;
    private JPanel panelMain;
    private JRadioButton mochaRadioButton;
    private JRadioButton cappucinoRadioButton;
    private JRadioButton teaRadioButton;
    private JCheckBox bagelCheckBox;
    private JCheckBox croissantCheckBox;
    private JCheckBox toastCheckBox;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JTextPane textPane3;
    private JButton enterButton;
    private JButton clearButton;
    private JButton exitButton;


    public App() {
        mochaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //selects coffee option
                if(mochaRadioButton.isSelected())
                    cappucinoRadioButton.setSelected(false);
                    teaRadioButton.setSelected(false);

            }
        });
        cappucinoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //selects cappucino
                if(cappucinoRadioButton.isSelected())
                    mochaRadioButton.setSelected(false);
                teaRadioButton.setSelected(false);

            }
        });
        teaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //selects tea
                if(teaRadioButton.isSelected())
                    mochaRadioButton.setSelected(false);
                cappucinoRadioButton.setSelected(false);

            }
        });
        bagelCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        croissantCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        toastCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                DecimalFormat df = new DecimalFormat("0.00");
                double total;
                double subtotal = 0;
                final double TAX_RATE = .08;
                double tax;
                final double MOCHA = 3.00;
                final double CAP = 3.00;
                final double TEA = 2.50;
                final double BAGEL = 1.25;
                final double CROISSANT = 1.15;
                final double TOAST = .50;

                if (mochaRadioButton.isSelected()){
                    subtotal = subtotal + MOCHA;

                }else if(cappucinoRadioButton.isSelected()){
                    subtotal = subtotal + CAP;
                }else if(teaRadioButton.isSelected()){
                    subtotal = subtotal + TEA;
                }

                if(bagelCheckBox.isSelected()){
                    subtotal = subtotal + BAGEL;
                }if(croissantCheckBox.isSelected()){
                    subtotal = subtotal + CROISSANT;
                }if(toastCheckBox.isSelected()){
                    subtotal = subtotal + TOAST;
                }

                textPane1.setText(Double.toString(subtotal));

                subtotal = Double.parseDouble(textPane1.getText());
                tax = subtotal * TAX_RATE;
                total = tax + subtotal;

                textPane2.setText(Double.toString(tax));
                textPane3.setText(Double.toString(total));

                textPane2.setText(df.format(tax));
                textPane1.setText(df.format(subtotal));
                textPane3.setText(df.format(total));

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //clears all fields

                mochaRadioButton.setSelected(false);
                cappucinoRadioButton.setSelected(false);
                teaRadioButton.setSelected(false);
                bagelCheckBox.setSelected(false);
                croissantCheckBox.setSelected(false);
                toastCheckBox.setSelected(false);

                textPane1.setText("");
                textPane2.setText("");
                textPane3.setText("");



            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //exit JFrame
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
