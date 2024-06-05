package tut13;

import javax.swing.*;

import java.awt.event.*;
import java.util.HashMap;

public class LoginGui implements ActionListener  {
    private static JLabel titleLabel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static HashMap<String,String> accounts;

    public static void main(String[] args) {

        accounts = new HashMap<>();
        accounts.put("duong","123");
        accounts.put("dinh","123");


        JFrame frame = new JFrame("Login Form");
        JPanel panel = new JPanel();

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        titleLabel = new JLabel("Login");

        userLabel = new JLabel("User");
        userLabel.setBounds(10,60,80,25);

        userText = new JTextField(20);
        userText.setBounds(100,60,165,25);

        passLabel = new JLabel("Password");
        passLabel.setBounds(10,90,80,25);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,90,165,25);

        button = new JButton("Login");
        button.setBounds(100,120,80,25);
        button.addActionListener(new LoginGui());


        success = new JLabel();
        success.setBounds(10,150,320,50);

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passLabel);
        panel.add(passwordText);
        panel.add(button);
        panel.add(success);

//        JPanel jPanel = new JPanel();
//        jPanel.setLayout(new GridLayout(3, 1));
//        JLabel lblSelect = new JLabel("Select your option:");
//        jPanel.add(lblSelect);
//        JRadioButton rdoMale = new JRadioButton("Male");
//        JRadioButton rdoFemale = new JRadioButton("Female");
//        ButtonGroup genders = new ButtonGroup();
//        genders.add(rdoMale);
//        genders.add(rdoFemale);
//        jPanel.add(rdoMale);
//        jPanel.add(rdoFemale);
//
//        JButton submit = new JButton("Submit");
//        JButton submit1 = new JButton("Submit");
//        JButton submit2= new JButton("Submit");
//        JButton submit3= new JButton("Submit");
//        jPanel.add(submit);
//        jPanel.add(submit1);
//        jPanel.add(submit2);
//        jPanel.add(submit3);
//
//
//        frame.add(jPanel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        String user = userText.getText();
        String password = passwordText.getText();

        if(isCorrectAccount(user,password)){
            success.setText("Login successfully!");
        }else{
            success.setText("Can not login. Please check out user and password again!");
        }

    }
    public boolean isCorrectAccount(String user,String password){
        // Check if the user is already in accounts
        if(accounts.containsKey(user)){
            // Check if the password matched or not
            return accounts.get(user).equals(password);
        }else{
            return false;
        }
    }


}
