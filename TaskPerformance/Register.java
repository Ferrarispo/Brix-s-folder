package OOP;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
   

public class Register implements ActionListener{

        JFrame SecFrame = new JFrame();
        JPanel panel = new JPanel();
        private static JTextField RegUserText;
        private static JTextField RegPassText;
        private static JLabel RegUser;
        private static JLabel RegPass;
        private static JLabel regform;
        private static JButton regcomplete;
        JButton Call;
      
    void Register(){
    

    
    SecFrame.setTitle("My Resto!");

    regform = new JLabel("Registration");
    regform.setBounds(10,1,80,25);
    SecFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    SecFrame.setSize(350,250);
    panel.setLayout(null);
    SecFrame.add(panel);

    RegUser = new JLabel("User:");
    RegUser.setBounds(10,30,80,25);
    panel.add(RegUser);

    RegUserText = new JTextField();
    RegUserText.setBounds(100, 30, 165, 25);
    panel.add(RegUserText);

    RegPass = new JLabel("Password:");
    RegPass.setBounds(10,60,80,25);
    panel.add(RegPass);

    RegPassText = new JPasswordField();
    RegPassText.setBounds(100, 60, 165, 25);
    panel.add(RegPassText);
    panel.add(regform);

    regcomplete = new JButton("Register");
    regcomplete.setBounds(100,90,100,20);
    regcomplete.addActionListener(new Register());
    panel.add(regcomplete);
    Call = new JButton("Back");
    Call.setBounds(200,90,100,20);
    Call.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            SecFrame.dispose();
        }
        
    });
    panel.add(Call);


    SecFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = RegUserText.getText();
        String pass = RegPassText.getText();

        try
        {
            FileWriter fr = new FileWriter("Accounts.txt", true);
            fr.write("name: "+name + "Password: " + pass);
            fr.write(System.getProperty("line.seperator"));
            fr.close();
            JOptionPane.showMessageDialog(null,"Registered Complete!");
            SecFrame.setVisible(false);
            new Register().setVisible(true);



        }
        catch(Exception v){
            JOptionPane.showMessageDialog(null, "Invalid");
        }   




        
        
        

    }

    private void setVisible(boolean b) {
        setVisible(true);
    }
}
    

