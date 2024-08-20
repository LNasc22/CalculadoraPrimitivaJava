package br.pucpr.lucassilva29.poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JPanel pnlMain;
    private JPanel pnl1;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSum;
    private JLabel lblResp;
    private JButton btnSub;
    private JButton btnDiv;
    private JButton btnMult;

    public Main() {
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1=Integer.parseInt(txtNum1.getText());
                int num2=Integer.parseInt(txtNum2.getText());
                int soma=num1+num2;
                lblResp.setText("Resultado: "+soma);
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1=Integer.parseInt(txtNum1.getText());
                int num2=Integer.parseInt(txtNum2.getText());
                int subt=num1-num2;
                lblResp.setText("Resultado: "+subt);
            }
        });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1=Integer.parseInt(txtNum1.getText());
                int num2=Integer.parseInt(txtNum2.getText());
                int mult=num1*num2;
                lblResp.setText("Resultado: "+mult);
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float num1=Integer.parseInt(txtNum1.getText());
                float num2=Integer.parseInt(txtNum2.getText());
                if (num2 == 0) {

                    JOptionPane.showMessageDialog(null, "Divisão por zero não permitida!!!");
                }
                else {

                    float div = num1 / num2;
                    lblResp.setText("Resultado: " + div);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
