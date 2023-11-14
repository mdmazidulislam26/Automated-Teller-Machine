package Bank_Management_Systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Fast_Cash extends JFrame implements ActionListener {

    JButton t100,t200,t500,t1000,t2000,t5000, cancel;
    String pin;
    Fast_Cash(String pin){
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(230,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        t100 = new JButton("100");
        t100.setBounds(170,415,150,30);
        t100.addActionListener(this);
        image.add(t100);

        t200 = new JButton("200");
        t200.setBounds(355,415,150,30);
        t200.addActionListener(this);
        image.add(t200);

        t500 = new JButton("500");
        t500.setBounds(170,450,150,30);
        t500.addActionListener(this);
        image.add(t500);

        t1000 = new JButton("1000");
        t1000.setBounds(355,450,150,30);
        t1000.addActionListener(this);
        image.add(t1000);

        t2000 = new JButton("2000");
        t2000.setBounds(170,485,150,30);
        t2000.addActionListener(this);
        image.add(t2000);

        t5000 = new JButton("5000");
        t5000.setBounds(355,485,150,30);
        t5000.addActionListener(this);
        image.add(t5000);

        cancel = new JButton("Cancel");
        cancel.setBounds(355,520,150,30);
        cancel.addActionListener(this);
        image.add(cancel);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == cancel){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }else {
            String amount_Number = ((JButton)ae.getSource()).getText();
            conn c = new conn();
            try {
                ResultSet rs = c.s.executeQuery("Select * from bank where pin ='"+pin+"'");
                int balance = 0;
                while (rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != cancel && balance < Integer.parseInt(amount_Number)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                }else{
                    Date date = new Date();
                    String query = "insert into bank values('"+pin+"','"+date+"','Withdraw','"+amount_Number+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,amount_Number+" Taka Withdraw Successfully");
                }
                setVisible(false);
                new Transaction(pin).setVisible(true);
            }catch (Exception e){
                System.out.println();
            }
        }
    }
    public static void main(String [] args){
        new Fast_Cash("");
    }
}
