import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Window extends JFrame implements ActionListener {

    HashMap<String,String> users = new HashMap<>();
    JFrame frame = new JFrame();
    JButton bSignUp = new JButton("Sign Up");
    JButton bCancel = new JButton("Cancel");
    JLabel lTaxNumber = new JLabel("TaxNumber: ");
    JLabel lName = new JLabel("Name: ");
    JLabel lSurname = new JLabel("Surname: ");
    JLabel lPassword = new JLabel("Password: ");
    JLabel lWrong = new JLabel("TaxNumber is used");
    JTextField tTaxNumber = new JTextField("");
    JTextField tName = new JTextField("");
    JTextField tSurname = new JTextField("");
    JPasswordField pPassword = new JPasswordField("");
    String usersName;
    String usersSurname;
    String usersTaxNumber;
    String usersPassword;

    public Window(HashMap<String,String> users2)
    {
        users = users2;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("LSign Up Window");
        frame.setLayout(null);

        lName.setBounds(70,30,100,20);
        frame.add(lName);
        
        lSurname.setBounds(70,70,100,20);
        frame.add(lSurname);
        
        lTaxNumber.setBounds(70,110,100,20);
        frame.add(lTaxNumber);
       
        lPassword.setBounds(70,150,100,20);
        frame.add(lPassword);

        bSignUp.setBounds(130,210,80,20);
        frame.add(bSignUp);
        bSignUp.addActionListener(this);

        bCancel.setBounds(230,210,80,20);
        frame.add(bCancel);
        bCancel.addActionListener(this);

        tName.setBounds(200,30,150,20);
        frame.add(tName);

        tSurname.setBounds(200,70,150,20);
        frame.add(tSurname);

        tTaxNumber.setBounds(200,110,150,20);
        frame.add(tTaxNumber);

        pPassword.setBounds(200,150,150,20);
        frame.add(pPassword);
    }
}
