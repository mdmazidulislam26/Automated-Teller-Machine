package Bank_Management_Systems;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {

    MiniStatement(String pin){
        setTitle("Mini Statement");

        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);

        JLabel bank = new JLabel("Apna Bank");
        bank.setBounds(150,20,100,20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);

        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from ACD where Pin_Number ='"+pin+"'");
            while (rs.next()){
                card.setText("Card number: "+rs.getString("Card_Number").substring(0,4)+"-XXXX-XXXX-"+rs.getString("Card_Number").substring(12));
            }
        }catch (Exception e){
            System.out.println();
        }
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin ='"+pin+"'");
            int bal = 0;
            while (rs.next()){
                if (rs.getString("type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
                mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
            }
            balance.setText("Your current balance is "+bal+" Taka");
        }catch (Exception e){
            System.out.println();
        }

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args){
        new MiniStatement("7090");
    }
}
