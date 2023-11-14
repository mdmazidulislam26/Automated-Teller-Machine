package Bank_Management_Systems;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signup1 extends JFrame implements ActionListener {

    long ran;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,postCodTextField,cityTextField,districtTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;

    signup1(){

        setLayout(null);

        Random rand = new Random();
        ran = Math.abs((rand.nextLong() % 900000L) + 100000L);

        JLabel fromNo = new JLabel("APPLICATION FROM NO: "+ran);
        fromNo.setFont(new Font("Raleway",Font.BOLD,38));
        fromNo.setBounds(100,20,620,40);
        add(fromNo);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,300,30);
        add(personDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fName = new JLabel("Father's Name: ");
        fName.setFont(new Font("Raleway",Font.BOLD,20));
        fName.setBounds(100,190,200,30);
        add(fName);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(0, 0, 0));
        add(dateChooser);

        JLabel gen = new JLabel("Gender: ");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(100,290,200,30);
        add(gen);

        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genGroup = new ButtonGroup();
        genGroup.add(male);
        genGroup.add(female);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel maritalStatus = new JLabel("Marital Status: ");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel postCode = new JLabel("Post Code: ");
        postCode.setFont(new Font("Raleway",Font.BOLD,20));
        postCode.setBounds(100,490,200,30);
        add(postCode);

        postCodTextField = new JTextField();
        postCodTextField.setFont(new Font("Raleway",Font.BOLD,14));
        postCodTextField.setBounds(300,490,400,30);
        add(postCodTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,540,400,30);
        add(cityTextField);

        JLabel district = new JLabel("District: ");
        district.setFont(new Font("Raleway",Font.BOLD,20));
        district.setBounds(100,590,200,30);
        add(district);

        districtTextField = new JTextField();
        districtTextField.setFont(new Font("Raleway",Font.BOLD,14));
        districtTextField.setBounds(300,590,400,30);
        add(districtTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ac){
        String formNumber = "" + ran;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gen = "";
        if(male.isSelected()){
            gen = "Male";
        } else if (female.isSelected()) {
            gen = "Female";
        }

        String email = emailTextField.getText();
        String maritalStatus = "";
        if(married.isSelected()){
            maritalStatus = "Married";
        } else if (unmarried.isSelected()) {
            maritalStatus = "Unmarried";
        } else if (other.isSelected()) {
            maritalStatus = "Other";
        }

        String address = addressTextField.getText();
        String postCode = postCodTextField.getText();
        String city = cityTextField.getText();
        String district = districtTextField.getText();

        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            } else if (fname.equals("")) {
                JOptionPane.showMessageDialog(null,"Father's is Required");
            }else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null,"Dath of Birth is Required");
            }else if (gen == (null)) {
                JOptionPane.showMessageDialog(null,"Gender is Required");
            }else if (email.equals("")) {
                JOptionPane.showMessageDialog(null,"Email is Required");
            }else if (maritalStatus == (null)) {
                JOptionPane.showMessageDialog(null,"Marital Status is Required");
            }else if (address.equals("")) {
                JOptionPane.showMessageDialog(null,"Address is Required");
            }else if (postCode.equals("")) {
                JOptionPane.showMessageDialog(null,"Post Code is Required");
            }else if (city.equals("")) {
                JOptionPane.showMessageDialog(null,"City is Required");
            }else if (district.equals("")) {
                JOptionPane.showMessageDialog(null,"District is Required");
            }else {//,fether_name,dob,gender,email,marital_status,address,post_code,city,district //
                conn c = new conn();
                String query = "insert into signup(fromNo,name,fether_name,dob,gender,email,marital_status,address,post_code,city,district) values('"+formNumber+"','"+name+"','"+fname+"','"+dob+"','"+gen+"','"+email+"','"+maritalStatus+"','"+address+"','"+postCode+"','"+city+"','"+district+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signup2(formNumber).setVisible(true);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String[]args){
        new signup1();
    }
}
