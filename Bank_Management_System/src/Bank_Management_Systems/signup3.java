package Bank_Management_Systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class signup3 extends JFrame implements ActionListener {

    JRadioButton saving_AC, fixed_deposit_AC, current_AC, recurring_deposit_AC;
    JCheckBox ATM_Card,internet_banking,mobile_banking,alert,cheque,e_Statement,declaration;
    JButton submit,cancel;
    String formNumber;

    signup3(String formNumber){
        this.formNumber = formNumber;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Rale way",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type: ");
        type.setFont(new Font("Rale way",Font.BOLD,22));
        type.setBounds(100,100,200,30);
        add(type);

        saving_AC = new JRadioButton("Saving Account");
        saving_AC.setFont(new Font("Rale way",Font.BOLD,16));
        saving_AC.setBackground(Color.WHITE);
        saving_AC.setBounds(100,140,150,20);
        add(saving_AC);

        current_AC = new JRadioButton("Current Account");
        current_AC.setFont(new Font("Rale way",Font.BOLD,16));
        current_AC.setBackground(Color.WHITE);
        current_AC.setBounds(100,180,150,20);
        add(current_AC);

        fixed_deposit_AC = new JRadioButton("Fixed Deposit Account");
        fixed_deposit_AC.setFont(new Font("Rale way",Font.BOLD,16));
        fixed_deposit_AC.setBackground(Color.WHITE);
        fixed_deposit_AC.setBounds(350,140,250,20);
        add(fixed_deposit_AC);

        recurring_deposit_AC = new JRadioButton("Recurring Deposit Account");
        recurring_deposit_AC.setFont(new Font("Rale way",Font.BOLD,16));
        recurring_deposit_AC.setBackground(Color.WHITE);
        recurring_deposit_AC.setBounds(350,180,250,20);
        add(recurring_deposit_AC);

        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(saving_AC);
        groupAccount.add(current_AC);
        groupAccount.add(fixed_deposit_AC);
        groupAccount.add(recurring_deposit_AC);

        JLabel card = new JLabel("Card Number: ");
        card.setFont(new Font("Rale way",Font.BOLD,22));
        card.setBounds(100,260,200,22);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4845");
        number.setFont(new Font("Rale way",Font.BOLD,22));
        number.setBounds(330,260,300,22);
        add(number);

        JLabel card_detail = new JLabel("Your 16 Digit Card Number");
        card_detail.setFont(new Font("Rale way",Font.BOLD,12));
        card_detail.setBounds(100,290,330,20);
        add(card_detail);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Rale way",Font.BOLD,22));
        pin.setBounds(100,330,200,22);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Rale way",Font.BOLD,22));
        pnumber.setBounds(330,330,100,22);
        add(pnumber);

        JLabel pin_detail = new JLabel("Your 4 Digit Pin");
        pin_detail.setFont(new Font("Rale way",Font.BOLD,12));
        pin_detail.setBounds(100,360,330,20);
        add(pin_detail);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Rale way",Font.BOLD,16));
        services.setBounds(100,410,200,18);
        add(services);

        ATM_Card = new JCheckBox("ATM CARD");
        ATM_Card.setBackground(Color.WHITE);
        ATM_Card.setFont(new Font("Rale way",Font.BOLD,16));
        ATM_Card.setBounds(100,460,200,30);
        add(ATM_Card);

        internet_banking = new JCheckBox("Internet Banking");
        internet_banking.setBackground(Color.WHITE);
        internet_banking.setFont(new Font("Rale way",Font.BOLD,16));
        internet_banking.setBounds(350,460,200,30);
        add(internet_banking);

        mobile_banking = new JCheckBox("Mobile Banking");
        mobile_banking.setBackground(Color.WHITE);
        mobile_banking.setFont(new Font("Rale way",Font.BOLD,16));
        mobile_banking.setBounds(100,510,200,30);
        add(mobile_banking);

        alert = new JCheckBox(" Email & SMS Alerts");
        alert.setBackground(Color.WHITE);
        alert.setFont(new Font("Rale way",Font.BOLD,16));
        alert.setBounds(350,510,200,30);
        add(alert);

        cheque = new JCheckBox("Cheque Book");
        cheque.setBackground(Color.WHITE);
        cheque.setFont(new Font("Rale way",Font.BOLD,16));
        cheque.setBounds(100,560,200,30);
        add(cheque);

        e_Statement = new JCheckBox("E-Statement");
        e_Statement.setBackground(Color.WHITE);
        e_Statement.setFont(new Font("Rale way",Font.BOLD,16));
        e_Statement.setBounds(350,560,200,30);
        add(e_Statement);

        declaration = new JCheckBox("I hereby declares that the above entered details are correct to the best of my konwlegd.");
        declaration.setBackground(Color.WHITE);
        declaration.setFont(new Font("Rale way",Font.BOLD,13));
        declaration.setBounds(100,600,600,30);
        add(declaration);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Rale way",Font.BOLD,14));
        submit.setBounds(545,680,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Rale way",Font.BOLD,14));
        cancel.setBounds(100,680,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);

        setSize(780,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String type = null;
            if(saving_AC.isSelected()){
                type = "Saving Account";
            } else if (fixed_deposit_AC.isSelected()) {
                type = "Fixed Deposit Account";
            }else if (current_AC.isSelected()) {
                type = "Current Account";
            }else if (recurring_deposit_AC.isSelected()) {
                type = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardNumber = ""+Math.abs((random.nextLong() % 90000000L) + 1200932600000000L);
            String pinNumber = ""+Math.abs((random.nextLong() % 9000L) + 1000L);

            String services = "";
            if(ATM_Card.isSelected()){
                services = services + "ATM CARD ";
            }else if(internet_banking.isSelected()){
                services = services + "Internet Banking ";
            }else if(mobile_banking.isSelected()){
                services = services + "Mobile Banking ";
            }else if(alert.isSelected()){
                services = services + "Email & SMS Alerts ";
            }else if(cheque.isSelected()){
                services = services + "Cheque Book ";
            }else if(e_Statement.isSelected()){
                services = services + "E-Statement";
            }

            try {
                if(type == null){
                    JOptionPane.showMessageDialog(null,"Account Type is Required.");
                }else if(declaration == null){
                    JOptionPane.showMessageDialog(null,"Declaration is Must.");
                }else {
                    conn c = new conn();
                    String query = "insert into signupThree(Form_No,Account_Type,Card_Number,Pin_Number,Services) values('"+formNumber+"','"+type+"','"+cardNumber+"','"+pinNumber+"','"+services+"')";
                    c.s.executeUpdate(query);
                    String query1 = "insert into ACD(Form_No,Card_Number,Pin_Number) values('"+formNumber+"','"+cardNumber+"','"+pinNumber+"')";
                    c.s.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null,"Card Number: "+cardNumber+"\nPin Number: "+pinNumber);
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(true);

                }
            }catch (Exception e){
                System.out.println();
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[]args){
        new signup3("");
    }
}
