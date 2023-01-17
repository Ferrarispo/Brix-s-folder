package OOP;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   

public class LoginInfo implements ActionListener{

    JFrame fame = new JFrame();
    private static JTextField userText;
    private static JTextField passText;
    private static JLabel User;
    private static JLabel Pass;
    private static JButton button;
    private static JButton registerButton;
    
    void Login(){
        
    
    
    fame.setTitle("My Resto!");
    JPanel panel = new JPanel();
    fame.setSize(350,250);
    fame.getContentPane().setBackground(Color.GRAY);
    fame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    panel.setLayout(null);
    fame.add(panel);

    User = new JLabel("User:");
    User.setBounds(10,30,80,25);
    panel.add(User);

    userText = new JTextField();
    userText.setBounds(100, 30, 165, 25);
    panel.add(userText);

    Pass = new JLabel("Password:");
    Pass.setBounds(10,60,80,25);
    panel.add(Pass);

    passText = new JPasswordField();
    passText.setBounds(100, 60, 165, 25);
    panel.add(passText);

    button = new JButton("Login");
    button.setBounds(10,90,80,20);
    button.addActionListener(new LoginInfo());
    panel.add(button);

    registerButton = new JButton("Register");
    registerButton.setBounds(100,90,100,20);
    registerButton.addActionListener(new LoginInfo());
    panel.add(registerButton);


    
    fame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passText.getText();
    if(e.getSource() == button){
        if(username.equals("Brix") && password.equals("12345")){
           fame.setVisible(false);
           fame.dispose();  
           frameko mew = new frameko();
           mew.Restaurant();       
             
        } 
    }
    if(e.getSource()==registerButton) {
           
           Register reg = new Register();
           reg.Register();

    }

}}
