package Bank_Management_Systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {

    JButton deposit,Cwithdrawal,FCash,statement,pin_change,balance_enquiry,exit;
    String pin;
    Transaction(String pin){
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        Cwithdrawal = new JButton("Cash Withdrawal");
        Cwithdrawal.setBounds(355,415,150,30);
        Cwithdrawal.addActionListener(this);
        image.add(Cwithdrawal);

        FCash = new JButton("Fast Cash");
        FCash.setBounds(170,450,150,30);
        FCash.addActionListener(this);
        image.add(FCash);

        statement = new JButton("Mini Statement");
        statement.setBounds(355,450,150,30);
        statement.addActionListener(this);
        image.add(statement);

        pin_change = new JButton("Pin Change");
        pin_change.setBounds(170,485,150,30);
        pin_change.addActionListener(this);
        image.add(pin_change);

        balance_enquiry = new JButton("Balance Enquiry");
        balance_enquiry.setBounds(355,485,150,30);
        balance_enquiry.addActionListener(this);
        image.add(balance_enquiry);

        exit = new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if (ae.getSource() == Cwithdrawal) {
            setVisible(false);
            new Withdraw(pin).setVisible(true);
        }else if (ae.getSource() == FCash) {
            setVisible(false);
            new Fast_Cash(pin).setVisible(true);
        }else if (ae.getSource() == pin_change) {
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }else if (ae.getSource() == balance_enquiry) {
            setVisible(false);
            new Balance_Enquiry(pin).setVisible(true);
        }else if (ae.getSource() == statement) {
            new MiniStatement(pin).setVisible(true);
        }
    }
    public static void main(String [] args){
        new Transaction("");
    }
}
