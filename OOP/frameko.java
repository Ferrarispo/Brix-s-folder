package OOP;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class frameko extends JFrame{
    //The Variables
    JLabel Custumer, Name, Contact, Food, Drinks, Type;

    JTextField TCustomer, TName,TContact;

    JComboBox FirstBox, SecondBox;

    JRadioButton ForFoods, ForDrinks;

    JTextArea Area51;

    JButton Resetbttn,Recieptbttn;

    static int friess = 100;
    static int clubhouse = 150; 
    static int taapsilog = 160; 
    static int donot = 85; 
    static int brown = 30; 
    static int carbs = 200;

    static int water = 20;
    static int mac= 120;
    static int amer= 130;


    //For image Icon
    ImageIcon image = new ImageIcon("LOGO2.jpg");

    //To be accessible

    void Restaurant(){

        //Customer
        Custumer = new JLabel("Customer number:");
        Custumer.setBounds(20,50,120,30);
                TCustomer = new JTextField();
                TCustomer.setBounds(150,50,120,30);
                    add(TCustomer);

        //Name
        Name = new JLabel("Name:");
        Name.setBounds(20,100,120,30);
                TName = new JTextField();
                TName.setBounds(150,100,120,30);
                    getContentPane().add(TName);

        //Contacts
        Contact = new JLabel("Contact Number:");
        Contact.setBounds(20,150,120,30);
                TContact = new JTextField();
                TContact.setBounds(150,150,120,30);
                    add(TContact);

        //Foods
        Food = new JLabel("Food:");
        Food.setBounds(20,200,120,30);
            String puds [] ={"Fries", "Club House","Tapsilog","Donut","Brownies","Carbonara"};
                FirstBox = new JComboBox<>(puds);
                FirstBox.setBounds(150,200,120,30);
                FirstBox.setBackground(Color.white);
                    add(FirstBox);

        //Drinks
        Drinks = new JLabel("Drinks:");
        Drinks.setBounds(20,250,120,30);
            String tubeg []= {"Ice Tea", "Water Bottle", "Macchiatto","Caramel","Frech Vanilla","Americano"};
                SecondBox = new JComboBox<>(tubeg);
                SecondBox.setBounds(150,250,120,30);
                SecondBox.setBackground(Color.white);
                    add(SecondBox);

        //Size of the drinks
        Type = new JLabel("Size: ");
            Type.setBounds(20,300,120,30);
                ForFoods = new JRadioButton("Regular");
                ForDrinks = new JRadioButton("Meduim");
                ForFoods.setBounds(150,300,120,30);
                ForDrinks.setBounds(250,300,120,30);
                    add(ForFoods);
                    add(ForDrinks);

        //For Reciept and Etc.
        Area51 = new JTextArea();
            Area51.setBounds(400,60,200,250);
            getContentPane().add(Area51);

         Resetbttn = new JButton("Reset");
            Resetbttn.setBounds(300,50,90,30);
            Resetbttn.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    TName.setText("");
                    TContact.setText("");
                    TCustomer.setText("");         
            }
            });
                    add(Resetbttn);

               Recieptbttn = new JButton("Reciept");
                Recieptbttn.setBounds(300,150,90,30);
                Recieptbttn.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Area51.setText("Customer Number: " + TCustomer.getText() +"\n============================" +"\nName: "+ TName.getText()+"\nContact: "+ TContact.getText()+"\n=============================");
                        Object choose = FirstBox.getSelectedItem();
                        if(choose.equals("Fries")){
                        Area51.setText(Area51.getText()+"\nFoods: "+FirstBox.getSelectedItem()+"                         "+friess);
                        }
                        if(choose.equals("Club House")){
                            Area51.setText(Area51.getText()+"\nFoods: "+FirstBox.getSelectedItem()+"                         "+clubhouse);
                            }
                            if(choose.equals("Tapsilog")){
                                Area51.setText(Area51.getText()+"\nFoods: "+FirstBox.getSelectedItem()+"                         "+taapsilog);
                                }
                                if(choose.equals("Donut")){
                                    Area51.setText(Area51.getText()+"\nFoods: "+FirstBox.getSelectedItem()+"                         "+donot);
                                    }
                                    if(choose.equals("Brownies")){
                                        Area51.setText(Area51.getText()+"\nFoods: "+FirstBox.getSelectedItem()+"                         "+brown);
                                        }
                                        if(choose.equals("Carbonara")){
                                            Area51.setText(Area51.getText()+"\nFoods: "+FirstBox.getSelectedItem()+"                         "+carbs);
                                            }
                        Area51.setText(Area51.getText()+"\n=============================");
                        Object dranks = SecondBox.getSelectedItem();
                        if(dranks.equals("Water Bottle") || dranks.equals("Ice Tea")){
                            Area51.setText(Area51.getText()+"\nDrinks: "+SecondBox.getSelectedItem()+"                        "+water);
                        }
                        if(dranks.equals("Macchiatto") || dranks.equals("Caramel")){
                            Area51.setText(Area51.getText()+"\nDrinks: "+SecondBox.getSelectedItem()+"                        "+mac);
                        }
                        if(dranks.equals("French Vanilla") || dranks.equals("Americano")){
                            Area51.setText(Area51.getText()+"\nDrinks: "+SecondBox.getSelectedItem()+"                        "+amer);
                        }
                        
                    }

                    
                });
                add(Recieptbttn);
        

        //Just Adding them to the main frame
            getContentPane().add(Custumer);
                getContentPane().add(Name);
                    getContentPane().add(Contact);
                         getContentPane().add(Food);
                            getContentPane().add(Drinks);
                              getContentPane().add(Type);


        //Frame
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setIconImage(image.getImage());
                setLayout(null);
                    setSize(800,400);
                setResizable(false);
                    setTitle("Resto!");
                setVisible(true);

        

    }

        
    }

