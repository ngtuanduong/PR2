package tut13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    private static JLabel lblUsername;
    private static JLabel lblPassword;
    private static JTextField txtUsername;
    private static JTextField txtPassword;
    private static JButton btnSubmit;

    public static void main (String[] args){

        JFrame jFrame = new JFrame("Login");
        jFrame.setSize(300,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        lblUsername = new JLabel("Username");
        lblPassword= new JLabel("Password");

        txtUsername = new JTextField();
        txtPassword = new JTextField();

        panel.add(lblUsername);
        panel.add(lblPassword);
        panel.add(txtUsername);
        panel.add(txtPassword);
        jFrame.add(panel);

    }
}
